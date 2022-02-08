<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	Integer cnt = (Integer)application.getAttribute("count");
	
	if(cnt == null){
		application.setAttribute("count", 1);
	}else{
		cnt +=1;
		application.setAttribute("count", cnt);
	}
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>현재 페이지 조회수 : <%=application.getAttribute("count") %></h1>
</body>
</html>