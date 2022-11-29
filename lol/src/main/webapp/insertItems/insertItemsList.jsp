<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>formulario nuevas actividades</title>
</head>
<body class="container">

	<form action="/insertItems" method="post" class="row d-flex justify-content-center">
	<div class="col-8 row justify-content-center"> 
		<div class="col-6 text-end">Nombre item</div><input type="text" id="item_name" name="item_name"  class="col-6"/> 
		<div class="col-6 text-end">Efecto</div><input type="text" id="effect" name="effect"  class="col-6"/> 
		 
		<input type="submit" value="enviar" />
	</div>
	</form>
	
	<a href="/index.jsp">Volver</a>
	
</body>
</html>