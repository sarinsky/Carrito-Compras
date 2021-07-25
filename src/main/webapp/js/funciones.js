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
	mostrarTabla(["ISBN","LIBRO","NOM", "LIBRO", "AUTOR", "LIBRO","EDITORIAL","PRECIO","CANTIDAD", "LIBRO","IMAGEN"], dato);
}


function mostrarTabla (atributos, tipo){
	var tabla = document.getElementById("contenidoTabla");
	var filas = atributos.forEach((at)=> {return "<th>"+at+"<th/>"})  
	filas= "<tr>"+filas+"</tr>";
	tabla.appendChild(filas);
	
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