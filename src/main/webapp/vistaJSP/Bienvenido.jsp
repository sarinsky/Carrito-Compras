<%@page import="com.modelo.dao.VideoJuego"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.domain.Controller.ControladorListar" %>
<%@page import="com.modelo.dao.Libro"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>

<script type="text/javascript">
function cerrar() { 
    $("body").html('<div alignt="center"><h1>Enviado Exitosamente!!!</h1></div>'); //Marca nuevo contenido con un mensaje que se envio exitosamente

    setTimeout(function(){
        window.close();
    },3000); //Dejara un tiempo de 3 seg para que el usuario vea que se envio el formulario correctamente

}
</script>
</head>
<meta charset="ISO-8859-1">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript"  src="../js/funciones.js"></script>
<link rel="stylesheet" type="text/css" href="../css/bootstrap/css/bootstrap.css">
<script type="text/javascript" src="../css/bootstrap/js/jquery.js"></script>
<script type="text/javascript" src="../css/bootstrap/js/bootstrap.min.js"></script>

<body background="../images/bg-01.jpg">
<nav class ="navbar navbar-inverse bg-inverse" >
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only" >Toggle navigation</span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
			</button>
		</div> 
		
		
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">

				<form class="navbar-form navbar-left">
					<div class="form-group ">
						<input type="text" class="form-control  "
							placeholder="Busca productos">
					</div>
					<button type="submit" class="btn btn-primary">Buscar</button>
					<label style="color: white; text-align:inherit;; margin-left: 200px;" >Bienvenido <%= session.getAttribute("correo") %></label>
				</form>
				<ul class="nav navbar-nav navbar-right">
				<!--  %
				String accion="";
				accion = request.getParameter("uAccion");
				
				switch(accion){
				case "salir";
				session.invalidate();
				request.setAttribute("message", "sesion finalizada");
				siguientPad ="/index.jsp";
				}
				%-->
				
				
					<li class="dropdown"><a  id="salir" href="/ServletCerrarSesion" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
						
						
						<span class="glyphicon glyphicon-user "style="font-size: 25px;"></span> </a>
						<ul class="dropdown-menu">
							<li><a href="Index.jsp">Iniciar sesion</a></li>		
						</ul></li>


				</ul>
				
					<!--  li class="dropdown"><a href="#" role="button"
						aria-haspopup="true" aria-expanded="false"> <span
							class="glyphicon glyphicon-shopping-cart"
							style="font-size: 25px;"></span>car
					</a></li-->
				
			</div>
			
		
	</div>
</nav>

<%
//HttpSession session = request.getSession();
if(session.getAttribute("correo")!=null){
		//response.sendRedirect("Login.jsp");
	}
	//System.out.println(session.getAttribute("correo")+"sesion");
	ControladorListar conLib = new ControladorListar();
	ControladorListar conVid = new ControladorListar();
%>
	<h1>Bienvenido :D <%= session.getAttribute("correo") %> </h1>
	
	<button onclick="mostrarDatos(1)" >LIBROS</button>
	
	<button onclick="mostrarDatos(2)">VIDEOJUEGOS</button>
	

	<input type="text" id="contenido" />
	
	
	
	<table  id ="contenidoTabla">	

	</table>
	 
<br>
<br>
	
	<button class="btn btn-primary" style="text-align: center; margin-left: 200px;">Log out</button>
  
</body>
</html>