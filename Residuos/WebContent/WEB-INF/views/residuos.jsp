<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="${pageContext.request.contextPath}/residuo/show" method="post" modelAttribute="residuo">
		Nombre:   <form:input path="nombre" type="text" /> <br>
		Quimicos: <form:input path="quimico" type="text"/> <br>
		Año degradacion: <form:input path="degradacionAnyo" type="number"/> <br>
		
		
		<input type="submit" value="Guardar"/>
	</form:form>
</body>
</html>