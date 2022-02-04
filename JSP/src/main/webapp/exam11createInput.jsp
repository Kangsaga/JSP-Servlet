<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align: center;">
		<h2>랜덤 당첨 작성</h2>
		<form action="exam11randomWinner.jsp" method="post">
			
			주제:<input type="text" name="title"><br>
				<%
					request.setCharacterEncoding("utf-8");
					int num = Integer.parseInt(request.getParameter("num"));
				
				
					for (int i =1; i<=num; i++){
						
						out.print("아이템"+i+":");
						out.print("<input type=text name=item><br>");
					}
				
				
				%>
			<input type="submit" value="시작">
		</form>
	</div>
</body>
</html>