<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키 삭제</h1>
	
	<%
		Cookie cookie = new Cookie("message","");
	
		//setMaxAge(초단위): 쿠키 정보의 유효기간을 설정하는 메소드 / 단, 0으로 입혁할 경우 삭제된!
		cookie.setMaxAge(0); //쿠키정보를 삭제한다는 의미!!
		response.addCookie(cookie);
	%>
	
</body>
</html>