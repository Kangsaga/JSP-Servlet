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
	<!-- ���� : �ʵ�(�������, ��������)�� �޼ҵ带 ���鶧 ����� -->
	<%!
		public int myNumber1 = 100;
	
		public String hello(){
			return "�ȳ��ϼ���!!~!";
	}
		// �ڵ��ϼ��� �ϸ� import�� �ڵ����� �ȴ�
		Random rd = new  Random();
	
	%>
	<% 
		int myNumber2 = 100;
	
	%>
	<%= hello() %>
	
	
	
</body>
</html>