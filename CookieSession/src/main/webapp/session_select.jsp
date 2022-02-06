<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>세션 값 조회</h1>
	
	
	<!-- 세션 정보를 바로 출력할 때 -->
	<%-- 세션에 저장된 값:<%= session.getAttribute("msg") %> --%>
	
	<!-- 세션 정보를 활용할 때 -->
	<%
		//다운 캐스팅으로 변수에 저장
		//다운 캐스팅을 하는 이유: 세션에 자장할 때 Object타입으로 저장되기 때문
		String msg = (String)session.getAttribute("msg");
		out.print("세션에 저장된 값 : "+msg +"<br>");
		
		//기본데이터 타입으로 저장된 데이터는 변수에 저장할 때 객테 타입으로 저장할 것!
		//WHY? 기본데이터 타입은 null값을 처리할 수 없기 때문!
		Integer num = (Integer)session.getAttribute("num");
		out.print("세션에 저장된 값2 : "+ num +"<br>");
		
		ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
		
		for (int i =0 ; i< list.size(); i++){
			out.print(list.get(i) + "<br>");
		}
		
	%>
</body>
</html>