<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>
	<%@ include file="RECURSOS/navbar.jsp"%>
	
	
	<form action="Ayudantia" method="POST">

		<p>
			Ingresa tu Id:<input type="text" name="id">
		</p>

		<p>
			Ingresa tu nombre completo: <input type="text" name="nombre">
		</p>

		<input type="submit" value="Enviar la información">

	</form>
	
</body>
</html>