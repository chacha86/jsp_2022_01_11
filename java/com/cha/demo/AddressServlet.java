package com.cha.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addr")
public class AddressServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 인코딩 설정
		response.setCharacterEncoding("utf-8"); // tomcat에게 utf-8처리해서 보내라
		response.setContentType("text/html; charset=utf-8"); // 브라우저한테 내가 보내는 걸 utf-8로 처리해라 
		
		PrintWriter out = response.getWriter();
		
		// 주소록 추가
		
		// 주소록 조회
		AddrDB db = new AddrDB();
		ArrayList<Addr> addrList = db.selectDatas();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>주소 목록</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h1>주소 목록</h1>");
		
		
		for(int i = 0; i < addrList.size(); i++) {
			Addr addr = addrList.get(i);
			out.println("	<div>");
			out.println("		번호 : " + addr.getIdx() + " <br />");
			out.println("		이름 : " + addr.getName() + " <br />");
			out.println("		주소 : " + addr.getAddress() + " <br />");
			out.println("		번호 : " + addr.getPhone() + " <br />");
			out.println("	</div>");
			out.println("	<hr>");
		}
		
		out.println("</body>");
		out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}


