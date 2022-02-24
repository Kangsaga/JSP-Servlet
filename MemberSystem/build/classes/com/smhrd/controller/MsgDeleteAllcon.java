package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MemberDTO;
import com.message.model.MessageDAO;


@WebServlet("/MsgDeleteAllcon")
public class MsgDeleteAllcon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		MemberDTO member = (MemberDTO) session.getAttribute("member");
		
		MessageDAO dao = new MessageDAO();
		
		String email = member.getM_email();
		
		int cnt = dao.messageDeleteAll(email);
		
		if(cnt > 0) {
			response.sendRedirect("main2.jsp");
		}else {

			response.setContentType("text/html; charset=utf-8");
			
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('메세지 전체 삭제 실패');");
			out.print("location.href='main2.jsp';");
			out.print("</script>");
		}
		
	}

}
