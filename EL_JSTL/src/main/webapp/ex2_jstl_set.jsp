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
<h1>JSTL 다루기</h1>
	<c:set var="request" value="getReq" scope="request" />
	<c:set var="session" value="getSession" scope="session" />
	<c:set var="application" value="getApplication" scope="application" />
	
	${request } ${session } ${application }<br>
	${ requestScope.request } ${sessionScope.session }${applicationScope.application }<br>
	
	<!-- scope를 설정하면 특정 서버영역에 데이터를 삭제 -->
	<c:remove var="request" scope="request" />
	request영역에 저장된 데이터 : ${request }${ requestScope.request } 
</body>
</html>