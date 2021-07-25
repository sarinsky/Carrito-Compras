/**
 * 
 */
ATRIBUTOS_LIBROS = ["ISBN","LIBRO","NOM", "LIBRO", "AUTOR", "LIBRO","EDITORIAL","PRECIO","CANTIDAD", "LIBRO","IMAGEN"]

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
    		let row = document.createElement("TR")

			if ( dato == 1) {
				mostrarTabla(ATRIBUTOS_LIBROS, row, tabla);
				libros = msg.split("\n")
				
				for(const lib of libros) {
					let row1 = document.createElement("TR")
					mostrarTabla(lib.split(","), row1, tabla)
				}

			} else {

			}			
	  });
	
}


function mostrarTabla (atributos, row, tabla){
	
	atributos.forEach(
		(at)=> {
            var el = document.createElement("TH")
            
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