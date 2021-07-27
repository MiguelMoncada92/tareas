<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<p style="color:red"><c:out value="${error}"/></p>
	<h1>¿Cual es el codigo?</h1>
	<form method="POST" action="/">
		<label>Código<input type="text" name ="code"/></label>
		<input type="submit" value="ingresar"/>
	</form>
</body>
</html>