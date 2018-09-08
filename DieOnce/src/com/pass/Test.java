package com.pass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/Test"},

initParams= {@WebInitParam(name="username",value="Anubhav"),@WebInitParam(name="password",value="abcd")
		
})
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pass= request.getParameter("pwd");
		String userName=getInitParameter("username");
		String pasd=getInitParameter("password");
		if( name.equals(userName)&& pass.equals(pasd))
		{
			out.println("<h3>Hi "+name+" You are authenticated.</h3><br> ");
			out.println("Please enter your city");
			out.println("<form method='post' action='FinalServlet'/>");
			out.println("City <input type='text' name='city'/><br>");
			out.println("<input type='hidden' name='uname' value='"+name+"'/>");
			out.println("<input type='submit'/>");	
			
			
		}
		else
		{
			response.sendRedirect("index.html");
		}
	
	
	}

}
