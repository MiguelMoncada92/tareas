<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo dojo</title>
</head>
<body>
	<h1>Crear nuevo dojo</h1>
	<form:form action ="/dojos/new" method="POST" modelAttribute="dojo">
	<p>
		<form:label path="name">Nombre</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
	</p>
	<input type="submit" value="Crear"/>
	</form:form>
</body>
</html>