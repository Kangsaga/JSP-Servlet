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
	<h1>�α��� </h1>
	<form action="LoginService" method="post">
			<input type="text" name="id" placeholder="ID�� �Է��ϼ���"><br>
			<input type="password" name="pw" placeholder="PW�� �Է��ϼ���"><br>
			<input type="submit" value="�α���">
	</form>
	</div>
	<%}else{ %>
	<div style="text-align: center;">
	<h1><%=nick %>��</h1>
	<p>�α��� �� �Դϴ�</p>
	<a href="logout.jsp">�α׾ƿ��ϱ�</a>
	</div>
	<%} %>
	
</body>
</html>