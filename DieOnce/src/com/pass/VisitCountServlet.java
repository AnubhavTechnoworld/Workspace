package com.pass;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Count")
public class VisitCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session =request.getSession();
		Integer count=(Integer) session.getAttribute("visitCount");
		if (count==null)
		{
			count=1;
		}
		else
		{
			count++;
		}
		session.setAttribute("visitCount", count);
		out.println("<h3>You have visited this site :"+count+" "+(count>1?"times":"time"));		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
