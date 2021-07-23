<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo</title>
</head>
<body>
	<h1><c:out value="${dojo.name}"/></h1>
	<table>
	    <thead>
	        <tr>
	        	<th>Id</th>
	            <th>Nombre</th>
	            <th>Apellido</th>
	            <th>Edad</th>
	        </tr>
	     </thead>
	     <tbody>
	     	<c:forEach items="${Ninja}" var="ninja">
		     	<tr>
		     		<td><c:out value="${ninja.firstName}"/></td>
		     		<td><c:out value="${ninja.lastName}"/></td>
		     		<td><c:out value="${ninja.age}"/></td>
		     		
		     	</tr>
	     	</c:forEach>
	     </tbody>
     </table>
</body>
</html>