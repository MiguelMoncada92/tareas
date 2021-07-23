<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>fecha</title>
<body>
<p>hola</p>
	<p>La fecha del sistema es: <fmt:formatDate value="${date}" pattern="yyyy-MM-dd HH:mm:ss" /> <c:out value="${date}"/></p>
</body>
</html>