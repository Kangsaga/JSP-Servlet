package com.pattern;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Map<key타입, value타입>
	//Key타입 -> String지정 
	// why? 사용자가 요청이 들어오면"/insert.do"와 같은 식별값을 활용해서 요청에대한 구분
	// "/insert.do" 요청이 들어오면 InsertService객체가 생성
	// "/update.do" 요청이 들어오면 UpdateService객체가 생성
	private Map<String, Command> map;
	
	@Override
	public void init() throws ServletException {
		map = new HashMap<String, Command>();
		
		//map.put(요청 식별 값, 식별 값과 연관된 객체);
		map.put("/insert.do",new InsertService());
		map.put("/delete.do", new DeleteService());
		map.put("/update.do", new UpdateService());
		map.put("/select.do", new SelectService());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//FrontController패턴
		// : 사용자의 모든  요청을 한 곳으로 전송할 수 있게 하는 구조
		// : WRLMapping의 경로를  "*.do" 설정
		// : 페이지에서는 모든 요청에 .do를 붙여야 하나의 서블릿으로 오게된
		// 단점
		// : 한 곳에 중앙집중화 되면서 로직이 길어지고 하나의 기능이 문제가 생기면
		//   모든 기능을 사용할 수 없게 된다는 문제점이 발생! -> 일반클래스 파일로 기능들을 분리
		
		
		//일반클래스 vs 서블릿
		// : HttpServlet을 상속 받앗는지에 대한 차이
		// : 지속적으로 서버에 메모리를 사용하는 것에 대한 차이
		
		
		// 인터페이스를 활용해서 일반클래스를 구현
		// : 이후에 만들어질 서비스에 대해서 동일한 메소드로 구현을 강제
		
		
		//Command 패턴
		// : 사용자의 요청에 따라 처리할 수 있는 일반 클래스들의 공통된 메소드로 구현될 수 있도록 하는 구조
		// : execute(HttpServletRequest, HttpServletResponse) 추상 메소드 구현
		// : 일반 클래스에 implements 키워드를 이용해서 인터 페이스 구현
		
		
		//requestURI : /DesignPattern/insert.do
		//contextPath : /DesignPattern
		//command : /insert.do
//		String requestURI = request.getRequestURI();
//		String contextPath = request.getContextPath();
//		String command = requestURI.substring(contextPath.length());
		
		
		// 파일경로(서블릿 맵핑된 경로)값 반환
		String command = request.getServletPath();
		System.out.println("요청 식별값 >>"+ command);
		
		Command com = map.get(command);
		com.execute(request, response);
		
//		if(command.equals("/insert.do")) {
//			//데이터 추가
//			Command insert = new InsertService();
//			insert.execute(request, response);
//		}else if(command.equals("/update.do")) {
//			//데이처 수정
//			Command update = new UpdateService();
//			update.execute(request, response);
//		}else if(command.equals("/delete.do")) {
//			//데잍터 삭제
//			Command delete = new DeleteService();
//			delete.execute(request, response);
//		}else if(command.equals("/select.do")) {
//			//데이터 조회
//			Command select = new SelectService();
//			select.execute(request, response);
//		}
		
	}

}
