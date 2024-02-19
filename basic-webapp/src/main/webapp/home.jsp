<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%= "Welcome to Request & out object in JSP" %>
<%
String user=request.getParameter("username");
String pass=request.getParameter("password");
out.println(user+" "+pass);
%> --%>
<%
response.sendRedirect("https://google.com");
%>
</body>
</html> 