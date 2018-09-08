package com.pass;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/Fileupload")
@MultipartConfig( location="C:/Users/anubhav.pathak/Desktop/upload",fileSizeThreshold=1024*1024,maxFileSize=1024*1024*3,
maxRequestSize=1024*1024*5*5)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Collection<Part> files=request.getParts();
		out.println("<h3>Number of Files Uploaded :"+files.size());
		for (Part part : files) {
			printPart(part, out);
			part.write(part.getSubmittedFileName());
			
			
		}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
	private void printPart(Part part,PrintWriter out)
	{
		StringBuilder sb= new StringBuilder();
		sb.append("<p>");
		sb.append("file Name : "+part.getSubmittedFileName());
		sb.append(">br>");
		sb.append("File Size :"+part.getSize());
		sb.append("<br>");
		sb.append("Content Encoding :"+part.getContentType());
		sb.append("<br>");
		sb.append("Input Element Name :"+part.getName());
		sb.append("<br>");
		for (String header : part.getHeaderNames()) {
			
			sb.append(header+" : "+part.getHeader(header));
			sb.append("<br>");			
		}
		sb.append("</p>");
		out.println(sb.toString());
		
		
	}

}
