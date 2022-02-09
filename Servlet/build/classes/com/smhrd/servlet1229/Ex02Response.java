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
		
		//response(���䰴ü): ����ڿ��� ��û����� �����ٶ� ����ϴ� ��ü
		//���䵥����: HTML�� ���� ����, �ؽ�Ʈ, �̹���, ���� ���� ��
		//�������̵�(redirect)
		
		//���䵥������ ������ �����ϴ� �޼ҵ�
		//Mime Type: ������ ���� ����
		//���ڵ�: ��ǻ�Ͱ� �ؼ��� �� �ֵ��� �������� ������ ����(EUC-KR, UTF-8)
		//�ؽ�Ʈ�� ���������� ���ڵ��� �� ��������� ������ ���������� ���ڵ��� �Ƚᵵ �ȴ�
		response.setContentType("text/html; charset=utf-8");
		
		//����ڿ��� �����͸� �����ϱ� ���� ��ü����
		//����� <------------������------------>����
		PrintWriter out = response.getWriter();
		
		// ������ ���� ������ title�̴�
		
		out.print("<html>");
		out.print("<head><title>respose��ü</title>");
		out.print("<style>");
		out.print("h1{background-color: whitesmoke}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1 align = center>");
		out.print("Hello �� ��");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
		// ctrl + s �� ������ ��� ��� �ϸ� ������ �ڵ����� �ε�Ϸ�ȴ�
		// �������� �̵��ؼ� ���ΰ�ħ�� ������ �����ȴ�
		
		// �ȵǸ� Servers -> Tomcat ������ Ŭ�� -> Restart ���Ȱ��
		// �������� �̵��ؼ� ���ΰ�ħ�� ������ �����ȴ�
		
	}

}
