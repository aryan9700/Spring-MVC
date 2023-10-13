<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>${Header}</H1>
<p>${Desc}<p>
<H1>Welcome, ${user.userName }</H1>
<H1>Your email is , ${user.email }</H1>
<H1>Password, ${user.password } Try to secure the password</H1>
</body>
</html>