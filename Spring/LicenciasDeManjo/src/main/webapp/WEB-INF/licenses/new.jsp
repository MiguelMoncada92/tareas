<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevas licencias</title>
</head>
<body>
	<h1>Crear nueva licencia</h1>
	<form:form action="/licenses/new" method="POST" modelAttribute="license">
	
	<p>
		<form:label path="number">Numero de licencia</form:label>
		<form:errors path="number"/>
		<form:input path="number"/>
	</p>
	<p>
		<form:label path="person">Sujeto</form:label>
		<form:errors path="person"/>
		<form:input path=<c: "person"/>
<%-- 		<form:select path="person"> --%>
<%-- 			<form:option value="-" label="--Please Select"/> --%>
<%--               <form:options items="${licence.person.id}" itemValue="code" itemLabel="name"/> --%>
<%-- 		</form:select> --%>
	</p>
	<p>
		<form:label path="state">Estado</form:label>
		<form:errors path="state"/>
		<form:input path="state"/>
	</p>
	<p>
		<form:label path="expirationDate">Fecha de vencimiento</form:label>
		<form:errors path="expirationDate"/>
		<form:input type="date" path="expirationDate"/>
	</p>
	
	<input type="submit" value="Crear"/>
</form:form>
<a href="/persons">Personas</a>
</body>
</html>