<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String conf = config.getInitParameter("n1");
out.println("conf value is "+conf);

String app = application.getInitParameter("n1");
out.println("app value is "+app);

%>
</body>
</html>