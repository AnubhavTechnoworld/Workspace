package com.speed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SimpleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String city=req.getParameter("city");
				
		out.println("Hello "+name+"You are from "+city+ " <br>");
		out.println("Simple Servlet Invoked "+"<br>");
		
	
		
		 ServletContext context=getServletContext();
	        String global=context.getInitParameter("Global Username");
	        out.println("Global Username= "+global);
	}
	

}
