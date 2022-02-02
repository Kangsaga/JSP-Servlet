<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String floor = request.getParameter("floor");
		String room = request.getParameter("room");
		
		int n1 = Integer.parseInt(floor);
		int n2 = Integer.parseInt(room);
	
	
	%>
	
	<table border="1px solid black">
		<% for (int i =1; i <=n1; i++){
			out.print("<tr>");
			
					for(int j=0; j<n2; j++){ 
						
						out.print("<td>"+j+"</td>");
						
					  } 
			out.print("</tr>");
		}
			
			%>
			
	</table>	
</body>
</html>