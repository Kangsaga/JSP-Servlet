<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%
		String nick = (String)session.getAttribute("nick");
		if(nick == null){
		%>
	<div style="text-align: center;">
	<h1>로그인 </h1>
	<form action="LoginService" method="post">
			<input type="text" name="id" placeholder="ID를 입력하세요"><br>
			<input type="password" name="pw" placeholder="PW를 입력하세요"><br>
			<input type="submit" value="로그인">
	</form>
	</div>
	<%}else{ %>
	<div style="text-align: center;">
	<h1><%=nick %>님</h1>
	<p>로그인 중 입니다</p>
	<a href="logout.jsp">로그아웃하기</a>
	</div>
	<%} %>
	
</body>
</html>