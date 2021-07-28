<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personas</title>
</head>
<body>
	<h1>Lista de personas</h1>
	<table>
	    <thead>
	        <tr>
	        	<th>Id</th>
	            <th>Nombre</th>
	            <th>Apellido</th>
	            <th>Licencia</th>
	        </tr>
	     </thead>
	     <tbody>
	     	<c:forEach items="${Person}" var="person">
		     	<tr>
		     		<td><c:out value="${person.id}"/></td>
		     		<td><c:out value="${person.firstName}"/></td>
		     		<td><c:out value="${person.lastName}"/></td>
		     		<td><c:out value="${person.license.number}"/></td>
		     		
		     	</tr>
	     	</c:forEach>
	     </tbody>
     </table>
     <div class="nuevo"><a href="/persons/new">Nueva persona</a></div>
     <div class="nuevo"><a href="/licenses/new">Nueva licencia</a></div>
</body>
</html>