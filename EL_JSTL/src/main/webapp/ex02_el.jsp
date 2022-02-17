<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String[] hobby = request.getParameterValues("hobby");
	String hobbys = "";
	
	for (int i = 0; i< hobby.length; i++){
		hobbys += hobby[i] + " ";
	}

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
			<td>취미</td>
		</tr>
		<tr>
			<td><%=id %></td>
			<td><%=pw %></td>
			<td><%=name %></td>
			<td><%=email %></td>
			<td><%=hobbys %></td>
		</tr>
		<tr><!--EL문법으로 HTML에서 입력한 값을 출력  -->
			<!-- 
				값 접근형식 : param.input태그의 name속성값
				param객체 == Java코드의 request.gerParameter()
				paramVallues객제 == request.getParameterValues()
			-->
			<td>${param.id }</td>
			<td>${param.pw }</td>
			<td>${param.name }</td>
			<td>${param.email }</td>
			<td>${paramValues.hobby[0]} ${ paramValues.hobby[1] }</td>
		
		</tr>
		
	</table>
</body>
</html>