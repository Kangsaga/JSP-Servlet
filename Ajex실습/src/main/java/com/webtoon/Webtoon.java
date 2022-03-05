package com.webtoon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.annotations.JsonAdapter;


@WebServlet("/Webtoon")
public class Webtoon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/plain; charset=utf-8");
		
		// Db에 있는 데이터를 WebtoonInfo 객체로 만들어서
		// webtoon.html로 전달
		
		//DB에 있는 데이터가정

		
		// 프리드로우 전선욱 토요일
		// 갓오브하이스쿨 박용제 금요일
		// 신의 탑 SIU 월요일
		WebtoonInfo wt1 = new WebtoonInfo("프리드로우", "전선욱", "토요일");
		WebtoonInfo wt2 = new WebtoonInfo("갓 오브 하이스쿨", "박용제", "금요일");
		WebtoonInfo wt3 = new WebtoonInfo("신의 탑", "SIU", "월요일");
		
		ArrayList<WebtoonInfo> wtList = new ArrayList<WebtoonInfo>();
		wtList.add(wt1);
		wtList.add(wt2);
		wtList.add(wt3);
		// DB에 있는 데이터를 가져왔다
		System.out.println("요청이 들어왔다");
		//데이터를 json 타잉ㅂ으로 바군뒤 반환 시켜줘야함!!
		// Gson 라이브러리 필요!
		
		//Gson 객체 만들기 --> 자바의 데이터를 json 타입으로 바꾸어 주는 역활
		Gson gson = new Gson();
		//jsonArray -> json 차입으로 바뀐 데이터를 저장할 수 있는 역활
		JsonArray jarray = new JsonArray();
		
		for (int i = 0; i < wtList.size(); i++) {
			jarray.add(gson.toJson(wtList.get(i)));
			//Gson 객체를 사용한다면 키값을 알아서 지정해줌
			//키값 --> 해당하는 변수명
		}
		
		PrintWriter out = response.getWriter();
		out.print(jarray);
		
	}

}
