package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MemberDAO;
import com.message.model.MemberDTO;



@WebServlet("/UpdateCon")
public class UpdateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
	    // �̸����� ȸ���������� Form���� �Է¹޴� ���� �ƴϱ� ������
	    // ���ǿ��� �����;� �Ѵ�
		HttpSession session = request.getSession();
		MemberDTO member = (MemberDTO) session.getAttribute("member");
		
		String email = member.getM_email();
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String add = request.getParameter("add");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.memberupdate(new MemberDTO(email, pw, tel, add));
		
		if (cnt > 0) {
			
			session.setAttribute("member", new MemberDTO(email, pw, tel, add));
			response.sendRedirect("main.jsp");
			
		}else{
			
			response.setContentType("text/html; charset=utf-8");
			
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('�������� ����');");
			out.print("location.href='main.jsp';");
			out.print("</script>");
		}
		
	}

}