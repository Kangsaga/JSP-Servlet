<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언문 : 필드(멤버변수, 전역변수)나 메소드를 만들때 사용함 -->
	<%!
		public int myNumber1 = 100;
	
		public String hello(){
			return "안녕하세요!!~!";
	}
		// 자동완성을 하면 import가 자동으로 된다
		Random rd = new  Random();
	
	%>
	<% 
		int myNumber2 = 100;
	
	%>
	<%= hello() %>
	
	
	
</body>
</html>