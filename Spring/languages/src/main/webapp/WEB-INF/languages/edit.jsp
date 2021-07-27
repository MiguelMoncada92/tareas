<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/edit.css">
	<style type="text/css">
		*{
		margin:0px;
		padding:0px;
		}
		
		h1{
			font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
			padding: 1%;
			background-color: orange;
		}
		table{
			border:1px solid black;
			margin-left:23%;
			margin-top:5%;
			width: 50%;
			box-shadow: 3px 3px 3px black;
		}
		th{
			border:1px solid black;
		}
		
		td{
			text-align:justify;
			border:1px solid red;
		}
		form{
			display:inline-block;
			margin:1%;
		}
		
	</style>
	<title>Editar</title>
</head>
	<body>
		<div class="enlaces">
			<a href="/languages">Inicio</a>
			<form action="/languages/${languages.id}" method="post">
	    	<input type="hidden" name="_method" value="delete">
	    	<input type="submit" value="Eliminar">
		</form>
		</div>
		<h1>Edite el lenguage <c:out value="${languages.name}"/></h1>
		<form:form action="/languages/${languages.id}" method="POST" modelAttribute="languages">
			<input type="hidden" name="_method" value="put">
			<p>
				<form:label path="name">Nombre</form:label>
				<form:errors path="name"/>
				<form:input path="name"/>
			</p>
			<p>
				<form:label path="creator">Creador</form:label>
				<form:errors path="creator"/>
				<form:input path="creator"/>
			</p>
			<p>
				<form:label path="version">Version</form:label>
				<form:errors path="version"/>
				<form:input path="version"/>
			</p>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>