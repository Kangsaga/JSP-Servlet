package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NumberPlus")
public class ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		//문자열 -> 정수 변환 : Integer.parsInt()
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		
		//int num1 = Integer.parseInt(request.getParameter("num1"));  -> 가능
		
		int result = num3 + num4;
		
		out.print("<html<head><title>응답결과</title></head>");
		out.print("<body>결과 값 : "+num3 + "+"+num4 +"=" + result+"</body></html>");
		
		}
		
	}


