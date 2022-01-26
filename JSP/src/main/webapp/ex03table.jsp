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
	String th = "";
	for (int i =1; i<=10; i++){
		th += "<th>"+i+"</th>";
	}
	
	
	%>
	
	<table border=1px soild black>
		<tr>
		
			<!-- <%for(int i=1; i<=10; i++){ %>
				
				<td><%= i %></td>	
				
			<%  } %> -->
		
		
			<%= th %> 
			
		</tr>
		
	</table>
	
</body>
</html>