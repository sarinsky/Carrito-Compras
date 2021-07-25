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
	  });
}
function mostrarTabla(id,nom, autor, editorial, precio, cantidad ){
	
	/**ISBN_LIBRO,NOM_LIBRO,AUTOR_LIBRO,EDITORIAL,PRECIO,CANTIDAD_LIBRO,IMAGEN */
	$.ajax({
		method: "POST",
		  url: "../Bienvenido",
		  data: { tipo:dato}
		
	})
	
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