<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		session.invalidate();
		response.sendRedirect("main.jsp");
	%> --%>
	
	<c:remove var="member" scope="session" />
	<c:redirect url="main2.jsp" />
	
</body>
</html>