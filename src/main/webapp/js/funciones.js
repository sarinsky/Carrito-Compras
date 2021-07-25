/**
 * 
 */
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
			mostrarTabla(["ISBN","LIBRO","NOM", "LIBRO", "AUTOR", "LIBRO","EDITORIAL","PRECIO","CANTIDAD", "LIBRO","IMAGEN"], dato);
	  });
	
}


function mostrarTabla (atributos, tipo){
	var tabla = document.getElementById("contenidoTabla");
    let row = document.createElement("TR")

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