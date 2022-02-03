<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 여기에서 네이버, 다음, 구글 해당되는 값에따라 페이지를 이동하시오 -->
	
	<% 
		request.setCharacterEncoding("utf-8");
		String url = request.getParameter("url");
		
		if(url.equals("네이버")){
			response.sendRedirect("http://www.naver.com");
		}else if(url.equals("다음")){
			response.sendRedirect("http://www.daum.net");
		}else if(url.equals("구글")){
			response.sendRedirect("http://www.google.co.kr");
		}
	
	
	%>
	
	
</body>
</html>