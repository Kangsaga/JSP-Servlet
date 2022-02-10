package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/maketable")
public class ex06maketable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String num = request.getParameter("num");
		
		int n = Integer.parseInt(num);
		
		out.print("<html>");
		out.print("<head><title></title>");
	
		out.print("</head>");
		out.print("<body>");
		out.print("<table border=1px soild black>");
		out.print("<tr>");
		
		for (int i =1; i<=n; i++) {
			out.print("<th align=center color=white>"+i+"</th>");
			
		}
		
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
