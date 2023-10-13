<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
	<H1>hello my name is hawk</H1>
	<%
	/* 
		String name = (String) request.getAttribute("name");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	 */
	%>
	<h1>
		My name is ${name }
		<%-- <%=name%></h1> --%>
		<h1>
			Time is ${time }
			<%-- <%=time.toString() %> --%>
		</h1>
		<h1>Marks are ${marks }</h1>
		<c:forEach var="item" items="${marks }">
			<%-- <h1>${item}</h1> --%>
			<h1>
				<c:out value="${item}"></c:out>
			</h1>
		</c:forEach>
</body>
</html>