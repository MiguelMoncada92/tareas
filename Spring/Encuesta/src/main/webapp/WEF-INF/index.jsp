<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>encuesta</title>
</head>
<body>
	<p style="color:red"><c:out value="${error}"/></p>
	<h1>Encuesta</h1>
	<form method="POST" action="/">
		<label>Nombre<input type="text" name ="name"/></label>
		<label>Dojo<input type="text" name ="dojo"/></label>
		<label>Lenguaje favorito<input type="text" name ="language"/></label>
		<label>Comentario (opcional)<input type="textarea" name ="comment"/></label>
		<input type="submit" value="ingresar"/>
	</form>
</body>
</html>