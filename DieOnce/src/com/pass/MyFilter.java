package com.pass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	
	
	private FilterConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=config.getInitParameter("User");
		String password=config.getInitParameter("Password");
		String userName=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		if(userName.equals(user)&& pass.equals(password))
		{
			out.println("<h3> This response if from First filter </h3>");
			chain.doFilter(request, response);
		}
		else
		{
			response.setContentType("text/html");
			out.println("<h4 style='color:red'>Invalid user Credential</h4>");
			
		}
		
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	this.config=filterConfig;
		
	}

}
