<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키정보 조회</h1>
	
	<%
		//사용자의 쿠키정보는 request객체로부터 접근이 가능!
		//접근시 Cookie배열을 반환받을 수 있음!
		Cookie[] cookies = request.getCookies();
		
	
		for (int i=0; i<cookies.length; i++){
			out.print("쿠키이름" + cookies[i].getName() + "<br>");
			//out.print("쿠키값" + cookies[i].getValue());
			
			//인코딩을 utf-8로 해줬을 때는 디코딩을 해주어야 그 값을 받아 올 수 있다
			out.print("쿠키값: "+ URLDecoder.decode(cookies[i].getValue(),"utf-8"));
			out.print("<hr>");
		}
	%>
	
</body>
</html>