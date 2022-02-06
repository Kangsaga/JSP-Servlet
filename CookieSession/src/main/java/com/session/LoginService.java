package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("kbs") && pw.equals("1234")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("nick", "¹Ùº¸");
			
			response.sendRedirect("main.jsp");
		}else {
			
			response.sendRedirect("loginF.jsp");
		}
		
	}

}
