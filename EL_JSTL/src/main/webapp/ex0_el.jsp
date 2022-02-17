<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Hello World! 문구 출력 -->
	<h2><%= "Hello world!" %></h2>
	
	<h2><% out.print("Hello World"); %></h2>
	
	<h2>${ "Hello World!"}</h2>
	
</body>
</html>