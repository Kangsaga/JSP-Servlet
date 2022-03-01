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
		// 서버가 실행할 때 특정값들을 초기화 해주는 메소드
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
		System.out.println("들어온 요청:" + command);
		
		// "/Login.do" 요청이 들어 왔을때
		//iCommand com = map.get("/LoginCon.do");
		// iCommand com = new LoginCon();
		iCommand com = map.get(command);
		com.execute(request, response);
		
		
//		if(command.equals("/LoginCon.do")) {
//			//로그인 처리
//			
//			
////			MemberDTO member = dao.memberlogin(email,pw);
////			
////			if(member != null) {
////				
////				System.out.println("로그인 성공");
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
////				out.print("alert('로그인 실패');");
////				out.print("location.href='main.jsp';");
////				out.print("</script>");
////			}
//			
//			
//			LoginCon login = new LoginCon();
//			login.execute(request, response);
//			
//		}else if (command.equals("/JoinCom.do")) {
//			//회원가입 처리
////			
////			int cnt = dao.memberjoin(new MemberDTO(email,pw,tel,add));
////			
////			if (cnt > 0) {
////				//회원가입 성공 했을때 -> join_success.jsp로 이동(email정보 전달)
////				request.setAttribute("success_data", email);
////				
////				//forward방식으로 페이지 이동
////				RequestDispatcher dispatcher = request.getRequestDispatcher("join_success.jsp");
////				dispatcher.forward(request, response);
////				
////			}else {
////				
////				out.print("<script>");
////				out.print("alert('회원가입 실패');");
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
