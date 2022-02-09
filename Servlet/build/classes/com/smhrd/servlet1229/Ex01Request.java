package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping: ���ڿ��� Servlet������ �����ϴ� ���
// Servlet������ �̸��� �������� �۾Ƶ� ���ᰡ��
// ���ǻ��� : '/'�� �ݵ�� �տ� �ۼ��Ǿ� �վ�� ��! �ۼ����� ���� ��� HTTP404���� �߻�!
@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//request(��û��ü): ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		//����: IP,������(����, ���, ���ڵ� ��� ���..), ����ڰ� �Է��� ������ ��..
		
		String ip = request.getRemoteAddr();
		
		System.out.println("������ IP >>" +ip);
		
		if(ip.equals("59.0.129.239")) {
			System.out.println("������ ȯ���մϴ�");
		}else if (ip.equals("210.183.87.89")) {
			System.out.println("�μ��� ȯ���մϴ�");
		}else if (ip.equals("211.33.239.153")) {
			System.out.println("������ ȯ���մϴ�");
		}else if (ip.equals("59.0.129.237")) {
			System.out.println("������ ȯ���մϴ�");
		}else if(ip.equals("59.0.236.207")) {
			System.out.println("����� ȯ���մϴ�");
		}else {
			System.out.println("ȯ���մϴ�");
		}
		
	}

}
