package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/join")
public class Ex09_join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		
		String[] gender = request.getParameterValues("gender");
		String[] hobby = request.getParameterValues("hobby");
		
		String birth = request.getParameter("birth");
		String color = request.getParameter("color");
		
		String[] country = request.getParameterValues("country");
		String talk = request.getParameter("talk");
		
		
		
		out.print("<html>");
		out.print("<head><title></title>");
	
		out.print("</head>");
		out.print("<body>");
		
		
		out.print("<p>ID :" + id + "</p>");
		out.print("<p>PW :" + pw + "</p>");
		out.print("<p>name :" + name + "</p>");
		out.print("<p>email :" + email + "</p>");
		out.print("<p>tel :" + tel + "</p>");
		
		out.print("<p>gender :" + Arrays.toString(gender) + "</p>");
		out.print("<p>hobby :" + Arrays.toString(hobby) + "</p>");
		
		out.print("<p>birth :" + birth + "</p>");
		out.print("<p>color :" + color + "</p>");
		
		out.print("<p>country :" + Arrays.toString(country) + "</p>");
		out.print("<p>talk :" + talk + "</p>");
		
		
		out.print("</body>");
		out.print("</html>");
		
		
		
		
		
		
	}

}
