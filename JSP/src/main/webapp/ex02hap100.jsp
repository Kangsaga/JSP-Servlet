<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<%
		int result = 0;
		for (int i =1; i<=100; i++){
			result += i;
		}
	
	
	
	%>
	
	1 ~ 100까지 합 : <%= result %>
	
</body>
</html>