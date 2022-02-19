<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- forEach태그 : Java의 for문과 같은 기능
		var : 변수명(생략)
		begin : 시작값
		end : 마지막 값
		step : 증가값(생략시 1씩 증가)
	 -->
	
	<c:forEach var="i" begin="1" end="10">
		${i }
	</c:forEach>
	
	<!-- 
		forEach 태그 두번째 구조
		var : 변수명
		items : 배열 또는 리스트 값
	 -->
	
	<% 
		ArrayList<String> list = new ArrayList<String>();
		list.add("운동");
		list.add("하고싶어요");
		list.add("코로나");
		list.add("망할");
		
		request.setAttribute("list", list);
		
	%>
		<c:forEach var="text" items="${list }">
			${text }
		</c:forEach>
</body>
</html>