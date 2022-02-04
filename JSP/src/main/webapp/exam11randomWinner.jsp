<%@page import="java.util.Random"%>
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
		request.setCharacterEncoding("utf-8");
	
		String title = request.getParameter("title");
		
		String[] item = request.getParameterValues("item");
		Random rd = new Random();
		
		int num = rd.nextInt(item.length);
	
	
	
	%>
	
	<div style="text-align: center;">
		<h2>랜덤 당첨 결과</h2>
		<p><%= title %></p>
		<p><%= item[num] %></p>
			
		
		
	
	</div>
</body>
</html>