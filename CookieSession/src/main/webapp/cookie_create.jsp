<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>쿠키 생성</h1>
	
	<%
		//쿠키 생성
		//new Cookie(쿠키이름, 데이터)
		//Cookie cookie = new Cookie("message","CookieCreate!");
		
		//쿠키는 숫자와 알파벳정보만 저장이 가능
		//한글데이터나 공백, 특수문자등을 저장할 때에는 인코딩을 설정
		Cookie cookie = new Cookie("message",URLEncoder.encode("cookie create! 한글","utf-8"));
		
		//사용자에게 생성한 쿠키를 전달하기 위해서 addCookie()활용
		response.addCookie(cookie);
		
	%>
	
</body>
</html>