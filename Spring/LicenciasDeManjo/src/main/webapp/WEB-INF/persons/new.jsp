<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Crear nueva persona</h1>
	<form:form action="/persons/new" method="POST" modelAttribute="person">
	<p>
		<form:label path="firstName">Nombre</form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Apellido</form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
	</p>
	
	<input type="submit" value="Crear"/>
</form:form>
</body>
</html>