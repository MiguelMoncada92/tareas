<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="../css/index.css">
		<title>Languages</title>
	</head>
<body>
	<h1>Lenguages de programeichon</h1>
<table>
    <thead>
        <tr>
            <th>Nombre</th>
            <th>Creador</th>
            <th>Version</th>
            <th>Acciones</th>
            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${Languages}" var="languages">
        <tr>
            <td><a href="/languages/${languages.id}"><c:out value="${languages.name}"/></a></td>
            <td><c:out value="${languages.creator}"/></td>
            <td><c:out value="${languages.version}"/></td>
            <td>
	            <form action="/languages/${languages.id}" method="post">
			    	<input type="hidden" name="_method" value="delete">
			    	<input type="submit" value="Eliminar">
				</form>
				<a href="/languages/edit/${languages.id}">Editar</a>
			</td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<div class="nuevo"><a href="/languages/new">Nuevo</a></div>
	

</body>
</html>