<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL문법 다루기</h1>
	
	\${true} : ${true}<br>
	
	\${100} : ${100}<br>
	
	\${3.14} : ${3.14}<br>
	
	\${"Hello"} : ${ "Hello" }<br>
	
	\${ 'World' } : ${ 'World' }<br>
	
	\${10+5} : ${10+5}<br>
	
	\${"5" + 1 } : ${"5"+1 }<br>
	
	\${6 / 2 } : ${6 / 2 }<br>
	
<%-- 	\${6 div 2 } : ${6 div 2 }<br> --%>
	
	\${"jsp" == "jsp" } : ${ "jsp" == "jsp" }<br>
	
	\${empty num } : ${ empty num }<br>
	
	\${empty "" } : ${empty "" }<br>
	
	
</body>
</html>