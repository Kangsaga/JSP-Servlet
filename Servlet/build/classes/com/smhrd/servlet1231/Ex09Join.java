package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinService")
public class Ex09Join extends HttpServlet {
   private static final long serialVersionUID = 1L;

   @Override
   protected void service(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      
      response.setContentType("text/html; charset=utf-8");
      
      PrintWriter out = response.getWriter();
      
      System.out.println("회원가입 신청!");
      String id = request.getParameter("user-id");
      String pw = request.getParameter("user-pw");
      String name = request.getParameter("user-name");
      String email = request.getParameter("user-email");
      String tel = request.getParameter("user-tel");
      String gender = request.getParameter("user-gender");
      String[] hobby = request.getParameterValues("user-hobby");
      String birthday = request.getParameter("user-birthday");
      String color = request.getParameter("user-color");
      String country=request.getParameter("user-country");
      String talk = request.getParameter("user-talk");

      System.out.println("ID : " + id);
      System.out.println("PW : " + pw);
      System.out.println("NAME : " + name);
      System.out.println("EMAIL : " + email);
      System.out.println("TEL : " + tel);
      System.out.println("GENDER : " + gender);
      System.out.print("HOBBY : ");
      for (int i = 0; i < hobby.length; i++) {
         System.out.print(hobby[i] + " ");
      }
      System.out.println();
      System.out.println("BIRTHDAY : "+birthday);
      System.out.println("COLOR : "+color);
      System.out.println("COUNTRY : "+country);
      System.out.println("TALK : "+talk);
      
      out.print("<html><head><title>Join</title></head>");
      out.print("<body><p>ID : "+id+"</p>");
      out.print("<p>PW : "+pw+"</p>");
      out.print("<p>NAME : "+name+"</p>");
      out.print("<p>EMAIL : "+email+"</p>");
      out.print("<p>TEL : "+tel+"</p>");
      out.print("<p>GENDER : "+gender+"</p>");
      out.print("<p>HOBBY : ");
      for (int i = 0; i < hobby.length; i++) {
         out.print(hobby[i] + " ");
      }
      out.print("</p>");
      out.print("<p>BIRTHDAY : "+birthday+"</p>");
      out.print("<p>COLOR : "+color+"</p>");
      out.print("<p>COUNTRY : "+country+"</p>");
      out.print("<p>TALK : "+talk+"</p>");
   }

}