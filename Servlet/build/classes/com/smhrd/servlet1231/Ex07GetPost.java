package com.smhrd.servlet1231;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetPost")
public class Ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	//Post방식일 때 한글 깨짐 방지
    	//데이터를 request객체로부터 가져오기 전에 설정!!!
    	req.setCharacterEncoding("utf-8");
    	
    	System.out.println("요청이 들어옴..!");
    	
    	
    	// 사용자가 입력한 ID와 PW를 변수에 저장한후 콘솔창에 출력!!
    	
    	String id = req.getParameter("user-id");
    	String pw = req.getParameter("user-pw");
    	
    	
    	System.out.println("ID: " + id);
    	System.out.println("PW: " + pw);
    	
    	
    	
    }
	
   

//	// Get방식일 때 호출
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Get방식으로 실행");
//
//	}
//
//	// Post방식일 때 호출
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Post방식으로 실행");
//
//	}

}
