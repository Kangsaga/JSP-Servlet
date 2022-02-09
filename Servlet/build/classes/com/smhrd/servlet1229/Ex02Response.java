package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex01Response")
public class Ex02Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response(응답객체): 사용자에게 요청결과를 보내줄때 사용하는 객체
		//응답데이터: HTML와 같은 문서, 텍스트, 이미지, 파일 형태 등
		//페이지이동(redirect)
		
		//응답데이터의 포맷을 설정하는 메소드
		//Mime Type: 데이터 포맷 설정
		//인코딩: 컴퓨터가 해석할 수 있도록 데이터의 형식을 지정(EUC-KR, UTF-8)
		//텍스트를 보낼때에는 인코딩을 꼭 써야하지만 파일을 보낼때에는 인코딩을 안써도 된다
		response.setContentType("text/html; charset=utf-8");
		
		//사용자에게 데이터를 전달하기 위한 객체생성
		//사용자 <------------데이터------------>서버
		PrintWriter out = response.getWriter();
		
		// 헤드라인 변수 지정은 title이다
		
		out.print("<html>");
		out.print("<head><title>respose객체</title>");
		out.print("<style>");
		out.print("h1{background-color: whitesmoke}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1 align = center>");
		out.print("Hello 혜 햬");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
		// ctrl + s 를 누르고 잠시 대기 하면 서버가 자동으로 로드완료된다
		// 브라우저로 이동해서 새로고침을 누르면 수정된다
		
		// 안되면 Servers -> Tomcat 오른쪽 클릭 -> Restart 기능활용
		// 브라우저로 이동해서 새로고침을 누르면 수정된다
		
	}

}
