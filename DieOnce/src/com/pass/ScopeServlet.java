package com.pass;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ScopeServlet")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userName=request.getParameter("name");
		ServletContext context=getServletContext();
		HttpSession session=request.getSession();//gives session
		if(userName!=null)
		{
			
		
		request.setAttribute("userName",userName);//storing in the request		
		
		session.setAttribute("userName", userName);//storing in the session		Single User Global Variable
		
		context.setAttribute("userName", userName);//storing in the context	 Multi User global variable
		}
		out.println("Value of the Request :"+request.getAttribute("userName"));
		out.println("<br>");
		out.println("Value of the Session :"+session.getAttribute("userName"));
		out.println("<br>");
		out.println("Value of the Context :"+context.getAttribute("userName"));
		out.println("<br>");
		out.println("My Seesion Id :"+session.getId());
		session.setMaxInactiveInterval(100);//In terms of Seconds
		session.invalidate();//forcefully terminate the session
		
	}



}
