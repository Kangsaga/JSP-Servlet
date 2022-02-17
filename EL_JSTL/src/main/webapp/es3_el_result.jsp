<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String id = (String) request.getAttribute("id");
	String pw = (String) request.getAttribute("pw");
	String name = (String) session.getAttribute("name");
	String email = (String) application.getAttribute("email");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1"><!-- 3행 5열 구조 -->
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>이메일</td>
		</tr>
		<tr>
			<td><%=id %></td>
			<td><%=pw %></td>
			<td><%=name %></td>
			<td><%=email %></td>
		</tr>
		
		<tr>
			<!-- EL문법 주석처리 2가지 -->
			<!-- \${서버 영역에 저장된 값의 name값 } -->
			<%-- ${서버 영역에 저장된 값의 name값 } --%>
			<td>${ id }</td>
			<td>${ pw }</td>
			<td>${ name }</td>
			<td>${ email }</td>
		
		</tr>
		<tr><!-- 서버 영역에 저장된 값을 접근할 때 정확히 해당 영역을 명시해서 접근
				형식 : 서버영역Scope.속성이름
				* 서버영역Scope를 붙여주지 않으면 page -> request -> session -> application 순으로
					검색해서 접근하게 된다
		 -->
			<td>${ requestScope.id }</td>
			<td>${ requestScope.pw }</td>
			<td>${ sessionScope.name }</td>
			<td>${ applicationScope.email }</td>
		</tr>
		
	</table>
</body>
</html>