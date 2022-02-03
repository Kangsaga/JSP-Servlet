<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="exam09requestResult.jsp" method="post">
		<fieldset>
			<legend>학점화면 프로그램</legend>
				<table>
					<tr>
					
						<td>이름</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
					
						<td>JAVA점수</td>
						<td><input type="text" name="java"></td>
					</tr>
					<tr>
					
						<td>WEB점수</td>
						<td><input type="text" name="web"></td>
					</tr>
					<tr>
					
						<td>IOT점수</td>
						<td><input type="text" name="iot"></td>
					</tr>
					<tr>
					
						<td>ANDROID점수</td>
						<td><input type="text" name="android"></td>
					</tr>
					<tr>
					
						
						<td colspan="2"><input type="submit"></td>
					</tr>
				
				
				
				</table>
		</fieldset>
	</form>
</body>
</html>