package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping: 문자열로 Servlet파일을 연결하는 기능
// Servlet파일의 이름과 동일하지 앟아도 연결가능
// 주의사항 : '/'가 반드시 앞에 작성되어 잇어야 함! 작성하지 않을 경우 HTTP404오류 발생!
@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//request(요청객체): 사용자가 요청을 했을 때 사용자의 정보를 저장하는 객체
		//정보: IP,브라우저(버전, 언어, 인코딩 방식 등등..), 사용자가 입력한 정보들 등..
		
		String ip = request.getRemoteAddr();
		
		System.out.println("접속한 IP >>" +ip);
		
		if(ip.equals("59.0.129.239")) {
			System.out.println("지원님 환영합니다");
		}else if (ip.equals("210.183.87.89")) {
			System.out.println("민서님 환영합니다");
		}else if (ip.equals("211.33.239.153")) {
			System.out.println("우진님 환영합니다");
		}else if (ip.equals("59.0.129.237")) {
			System.out.println("혜정님 환영합니다");
		}else if(ip.equals("59.0.236.207")) {
			System.out.println("강사님 환영합니다");
		}else {
			System.out.println("환영합니다");
		}
		
	}

}
