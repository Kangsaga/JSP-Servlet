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
	<%-- <% 
		Cookie[] cookies = request.getCookies();
		if (cookies != null){
			for (int i = 0; i< cookies.length; i++){
				String name = cookies[i].getName();
				String value = URLDecoder.decode(cookies[i].getValue(),"utf-8");
				
				if(name.contains("nick")){
					out.print("<h1>"+value+"님! 환영합니다!<h1>");
					break;
				}
			}
		}
	
	
	%> --%>


	<%-- <h1><%= request.getParameter("nick") %>님! 환영합니다</h1> --%> 
	
	
	
	<!-- 세션에 저장된 닉네임을 출력해보기 -->
	<h1><%= session.getAttribute("nick") %>님! 환영합니다!</h1>
	
	
	
</body>
</html>