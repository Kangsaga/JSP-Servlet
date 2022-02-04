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
		request.setCharacterEncoding("utf-8");
		
		String java = request.getParameter("java");
		String web = request.getParameter("web");
		String iot = request.getParameter("iot");
		String android = request.getParameter("android");
		String name = request.getParameter("name");
		
		int num1 = Integer.parseInt(java);
		int num2 = Integer.parseInt(web);
		int num3 = Integer.parseInt(iot);
		int num4 = Integer.parseInt(android); 
		double avg = (num1 + num2 + num3 + num4 ) / 4.0;
		
			String grade ="";
		
		if (avg <=100 && avg >=95){
			grade +=  "A+";
		}else if (avg < 95 && avg >=85){
			grade +=  "A";
		}else if (avg < 85 && avg >=80){
			grade +=  "B+";
		}else if (avg < 80 && avg >=70){
			grade +=  "B";
		}else {
			grade +=  "F";
		}
	%>
		
		<table>
			<tr>
				
				<td>이름 </td>
				<td><%= name %> </td>
				
			</tr>
			<tr>
				
				<td>JAVA점수 </td>
				<td><%= java %> </td>
				
			</tr>
			<tr>
				
				<td>WEB점수 </td>
				<td><%= web %> </td>
				
			</tr>
			<tr>
				
				<td>IOT점수 </td>
				<td><%= iot %> </td>
				
			</tr>
			<tr>
				
				<td>ANDROID점수 </td>
				<td><%= android %> </td>
				
			</tr>
			<tr>
				
				<td>평균 </td>
				<td><%= avg %> </td>
				
			</tr>
			<tr>
				
				<td>학점 </td>
				<th align="left"><%= grade %> </th>
				
			</tr>
		
		
		
		
		
		</table>
		
		
	
	
	
	
	
	
	
	
	
</body>
</html>