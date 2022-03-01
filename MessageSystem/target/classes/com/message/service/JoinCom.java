package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.model.MemberDAO;
import com.message.model.MemberDTO;



public class JoinCom implements iCommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		//�̸���, ��й�ȣ, ��ȭ��ȣ, �ּ�
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String add = request.getParameter("add");
		
		
		
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memberjoin(new MemberDTO(email,pw,tel,add));
		
		if (cnt > 0) {
			//ȸ������ ���� ������ -> join_success.jsp�� �̵�(email���� ����)
			request.setAttribute("success_data", email);
			
			//forward������� ������ �̵�
			RequestDispatcher dispatcher = request.getRequestDispatcher("join_success.jsp");
			dispatcher.forward(request, response);
			
		}else {
			
			response.setContentType("text/html; charset=utf-8");
			
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('ȸ������ ����');");
			out.print("location.href='main2.jsp';");
			out.print("</script>");
			
			
		}
		
	}

}
