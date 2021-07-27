<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title><c:out value="${languages.name}"></c:out></title>
	</head>
	<body>
		<h1><c:out value="${languages.name}"/></h1>
		<p>Creador: <c:out value="${languages.creator}"/></p>
		<p>Version: <c:out value="${languages.version}"/></p>
		<a href="/languages/edit/${languages.id}">Edit lenguaje</a>
		<form action="/languages/${languages.id}" method="post">
	    	<input type="hidden" name="_method" value="delete">
	    	<input type="submit" value="Delete">
		</form>
		<a href="/languages">Inicio</a>
	</body>
</html>