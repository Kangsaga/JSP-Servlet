<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		request.setAttribute("id", "smhrd");
		request.setAttribute("pw", "1234");
		session.setAttribute("name", "스인개");
		application.setAttribute("email", "smhrd@smhrd.co.kr");
		
		/* ex3_el_result.jsp로 이동 */
		RequestDispatcher dispatcher = request.getRequestDispatcher("es3_el_result.jsp");
		dispatcher.forward(request, response);
	%>
</body>
</html>