/**
 * 
 */
const ATRIBUTOS_LIBROS = ["ISBN_LIBRO","NOM_LIBRO","AUTOR_LIBRO", "EDITORIAL", "PRECIO", "CANTIDAD_LIBRO"]
const ATRIBUTOS_VIDEO= ["CVE_VIDEO", "NOM_VIDEO", "DISTRIBUIDORA_VIDEO", "PRECIO_VIDEO", "CANTIDAD_VIDEO"]
/**CVE_VIDEO
NOM_VIDEO
DISTRIBUIDORA_VIDEO
PRECIO_VIDEO
CANTIDAD_VIDEO
IMAGENVIDEO */
function cerrar(){
	window.close;
}
function mostrarDatos(dato){

	$.ajax({
			method: "POST",
		  url: "../ServletListar",
		  data: { tipo:dato}
	})
	  .done(function( msg ) {	
	    console.log( "Data Saved: " + msg );
			document.getElementById("contenido").value = msg;	
			console.log(msg.split("\n"));

			var tabla = document.getElementById("contenidoTabla");
			tabla.innerHTML = "";
    		let row = document.createElement("TR")

			if ( dato == 1) {
				mostrarTabla(ATRIBUTOS_LIBROS, row, tabla);
				let libros = msg.split("\n")
				
				for(const lib of libros) {
					let row1 = document.createElement("TR")
					mostrarTabla(lib.split(","), row1, tabla)
				}

			} else {
				var tabla = document.getElementById("contenidoTabla");
			tabla.innerHTML = "";
    		let row = document.createElement("TR")
				mostrarTabla(ATRIBUTOS_VIDEO, row, tabla);
				let videos = msg.split("\n")
				for(const vid of videos){
					let row2 = document.createElement("TR")
					mostrarTabla(vid.split(","), row2, tabla)
				}
				

			}			
	  });
	
}


function mostrarTabla (atributos, row, tabla){
	
	atributos.forEach(
		(at)=> {
            let el = document.createElement("TH")
            
            el.innerHTML = String(at)
            row.appendChild(el)
		})  
	tabla.append(row)
	
}

/**
function mostrarDatos(dato){

	$.ajax({
			method: "POST",
		  url: "../ServletListar",
		  data: { tipo:dato}
	})
	  .done(function( msg ) {
	    console.log( "Data Saved: " + msg );
			document.getElementById("contenido").value = msg;
			
	  });

	

}
 */