<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<link rel="stylesheet" type="text/css" href="../css/util.css">
	<link rel="stylesheet" type="text/css" href="../css/main.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
<body>
<h1 style="text-align: center">Registro Usuario</h1>	

<form style="text-align: center" class="form-horizontal" method="post"  action="/Carrito_Compras/ServletRegistroUsuario">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nombre Usuario</label>
      <input type="text" class="form-control" name ="nomUsu" id="inputEmail4" placeholder="Nombre Usuario">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Correo</label>
      <input type="email" class="form-control" id="inputPassword4" name="correo" placeholder="Correo">
    </div>
  </div>
  <div class="form-group col-md-6">
    <label for="inputAddress">Password</label>
    <input type="password" class="form-control" id="inputAddress" name="pass" placeholder="Contraseña">
  </div>

  <!--div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <  label class="form-check-label" for="gridCheck">
        Registrar
      </label>
    </div>
  </div-->
  <button type="submit" class="btn btn-primary">Registrar</button>
</form>
</body>
</html>