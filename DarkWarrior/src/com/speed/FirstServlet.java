package com.speed;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/FirstServlet","/fservlet"},
initParams= {@WebInitParam(name="uname",value="Anubhav"),@WebInitParam(name="Company",value="Mphasis")},

	loadOnStartup=1
		
		
		)
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public FirstServlet() {
     
     
    }

	
	@SuppressWarnings("static-access")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome To New Way Of Creating Servlet</h1>");
        String name=getInitParameter("uname");
        String com=getInitParameter("Company");
        out.println("<br>");
        out.println("Hello "+name+" You are working for "+com +"<br>");
        
        
        ServletContext context=getServletContext();
        String global=context.getInitParameter("Global UserName");
        out.println("Global UserName= "+global);
        out.println("<hr>");
        out.println("Server name ="+request.getServerName());
        out.println("<br>");
        out.println("Server Port ="+request.getServerPort());
        out.println("<br>");
        out.println("Server info = "+context.getServerInfo());
        out.println("<hr>");
        out.println("Client Machine "+request.getRemoteHost());
        out.println("Client Address "+request.getRemoteAddr());
        out.println("<br>");
        out.println(" User= "+request.getRemoteUser());
        out.println("<hr>");
        /*out.println(request.getHeader("Accept"));
        out.println("<br>");
        out.println(request.getHeader("Accept-Language"));
        out.println("<br>");
        out.println(request.getHeader("Accept-Encoding"));*/
        Enumeration<String> headers=request.getHeaderNames();
        while (headers.hasMoreElements()) {
			String head =headers.nextElement();
			out.println(head+" ="+request.getHeader(head)+"<br>");
			
		}
        log("this is the log file to correct your errors"+new Date());
        //response.sendError(response.SC_NOT_FOUND,"hey there");
        //response.setHeader("refresh", "3;http://www.microsoft.com")
        /*response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("location","http://www.apple.com");
        */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
