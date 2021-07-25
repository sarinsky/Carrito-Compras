<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.domain.Controller.ControladorListar"%>
<%@page import="com.modelo.dao.Libro"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/bootstrap/css/bootstrap.css">
<script type="text/javascript" src="../css/bootstrap/js/jquery.js"></script>
<script type="text/javascript" src="../css/bootstrap/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript"  src="../js/funciones.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.button{
}
.carousel-inner img {
	width: 100%;
	max-height: 460px;
}

.carousel-inner {
	height: 350px;
}
.label{
    display: inline-block;
	border-collapse:collapse;
	border-style: solid;
	border-width: 2px;
    width: 40px;
    height: 40px;
    line-height: 40px;
    margin-top: auto;
    margin-left: auto;
    margin-bottom: auto;
</style>

</head>
<body background="../images/bg-01.jpg">
	<%
	if(session.getAttribute("correo")==null){
			response.sendRedirect("Login.jsp");
		}
		System.out.println(session.getAttribute("correo")+ "imprimo nombr");
		ControladorListar conLib = new ControladorListar();
		ControladorListar lisVid = new ControladorListar();
	%>


		
	
	<nav class="navbar navbar-inverse bg-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
				</button>
				<ul class="nav navbar-nav">
					<li class="dropdown">
					<a class="dropdown-toggle" href="#" data-toggle="dropdown" role="button" aria-haspoup="true"
						aria-expanded="false">
						Todas las categorias
						<span class="caret"></li>
						</span></a>
						<ul class="dropdown-menu">
							<li><a href="#"><span class="glyphicon glyphicon-phone"></span>
									Celulares</a> 
									<a href="#">TV, Audio y Video</a> 
									<a href="#">Computación</a>
									<a href="#">Consolas y Videojuegos</a> 
									<a href="#">Hogar</a> 
									<a href="#">Electrodomésticos</a> 
									<a href="#">Moda</a> <a href="#">Relojes y Accesorios</a> 
									<a href="#">Belleza</a> 
									<a href="#">Salud y bienestar</a> 
									<a href="#">Juguetes. niños y bebes</a> 
									<a href="#">Deportes</a>
								</li>
						</ul></li>
				</ul>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			
			
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

					<li class="dropdown"><a href="../Index.jsp" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
						<span class="glyphicon glyphicon-user "style="font-size: 25px;"></span> </a>
						<ul class="dropdown-menu">
							<li><a href="Index.jsp">Iniciar sesion</a></li>		
						</ul></li>

					<li class="dropdown"><a href="#" role="button"
						aria-haspopup="true" aria-expanded="false"> <span
							class="glyphicon glyphicon-shopping-cart"
							style="font-size: 25px;"></span>car
					</a></li>

				</ul>
			</div>
			
			
			
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<nav>
	<!-- HASTA AQUI TERMINA ELL FOOTER, EMPIEZA EL BODY -->
	<h1 style="font-family: cursive;">Seccion</h1></nav>
	<!--  button type="submit" class="btn btn-primary">Buscar</button-->
	
	<!--  >form action="/ServletListar" method="post"> </form-->
	
	<button  class="btn btn-primary" onclick="mostrarDatos(1)" >LIBROS</button>
	<button class="btn btn-primary" onclick="mostrarDatos(2)">VIDEOJUEGOS</button>
	<input type="text" id="contenido"/>
	
	
	
	
	<table>	
	
	<tr>
		<th>NOMBRE LIBRO</th>
	    <th>AUTOR DEL LIBRO</th>
	    <th>PRECIO </th>
	    <th>EDITORIAL</th>
	</tr>
	<%
	for(Libro l:conLib.getListLibros()){
	%>
	<tr>
		<td><%=l.getNomLibro() %></td>
		<td><%=l.getAutorLibro()%></td>
		<td><%=l.getPrecio() %></td>
		<td><%=l.getEditorial() %></td>
		<td><%=l.getCantidad() %></td>
		
	</tr>
	
	  <% } %>
	</table>
	
	
	
	</table>
</body>
</html>