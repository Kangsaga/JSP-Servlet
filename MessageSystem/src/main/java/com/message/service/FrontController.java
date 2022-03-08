package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MemberDAO;
import com.message.model.MemberDTO;

import oracle.jdbc.LogicalTransactionId;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, iCommand> map;
	
	@Override
	public void init() throws ServletException {
		// ������ ������ �� Ư�������� �ʱ�ȭ ���ִ� �޼ҵ�
		map = new HashMap<String, iCommand>();
		map.put("/LoginCon.do", new LoginCon());
		map.put("/JoinCom.do", new JoinCom());
		
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
//		System.out.println(requestURI);
//		System.out.println(contextPath);
		System.out.println("���� ��û:" + command);
		
		// "/Login.do" ��û�� ��� ������
		//iCommand com = map.get("/LoginCon.do");
		// iCommand com = new LoginCon();
		iCommand com = map.get(command);
		com.execute(request, response);
		
		
//		if(command.equals("/LoginCon.do")) {
//			//�α��� ó��
//			
//			
////			MemberDTO member = dao.memberlogin(email,pw);
////			
////			if(member != null) {
////				
////				System.out.println("�α��� ����");
////				
////				HttpSession session = request.getSession();
////				
////				session.setAttribute("member", member);
////				
////				response.sendRedirect("main.jsp");
////				
////			}else {
////				
////				out.print("<script>");
////				out.print("alert('�α��� ����');");
////				out.print("location.href='main.jsp';");
////				out.print("</script>");
////			}
//			
//			
//			LoginCon login = new LoginCon();
//			login.execute(request, response);
//			
//		}else if (command.equals("/JoinCom.do")) {
//			//ȸ������ ó��
////			
////			int cnt = dao.memberjoin(new MemberDTO(email,pw,tel,add));
////			
////			if (cnt > 0) {
////				//ȸ������ ���� ������ -> join_success.jsp�� �̵�(email���� ����)
////				request.setAttribute("success_data", email);
////				
////				//forward������� ������ �̵�
////				RequestDispatcher dispatcher = request.getRequestDispatcher("join_success.jsp");
////				dispatcher.forward(request, response);
////				
////			}else {
////				
////				out.print("<script>");
////				out.print("alert('ȸ������ ����');");
////				out.print("location.href='main.jsp';");
////				out.print("</script>");
////			}
//			
//			JoinCom join = new JoinCom();
//			join.execute(request, response);
//			
//		}
//		
	}

}
