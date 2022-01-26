<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP에서 정수형 변수 num에 100을 넣고 웹페이지에 출력 -->
	
	 <%-- JSP 주석 --%>
	<!-- html 주석 -->
	
	<%-- jsp에서 java코드를 사용하고 싶다면 스크립트릿을 사용한다 --%>
	<%
		// java주석 가능
		int num = 100;
	
		int num1 = 30;
	%>
	<%--jspf에서 java변수의 값을 웨페이로 꺼내고 ㄹ때는 표현식을 사용한다 --%>
	num의 값은 : <%= num %><br>
	
	<hr width="500px" size="<%= num1 %>px" color="red">
	
	
</body>
</html>