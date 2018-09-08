package com.pass;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LocServlet")
public class LocServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		/*Locale l1=Locale.getDefault();
		out.println("<p> Default Locale "+l1+"</p>");
		out.println("<p> Country "+l1.getCountry()+"</p>");
		out.println("<p> Language "+l1.getLanguage()+"</p>");
		out.println("<p> Display Country Name "+l1.getDisplayCountry()+"</p>");
		out.println("<p> Display language "+l1.getDisplayLanguage()+"</p>");
		out.println("<p> Display Full "+l1.getDisplayName()+"</p>");*/
		
		/*Locale l= new Locale("fr");
		out.println("<p> Language "+l.getDisplayLanguage()+"</p>");
		Locale l1=new Locale("de","DE");
		out.println("<p> Language "+l1.getDisplayLanguage()+"</p>");
		out.println("<p> Country "+l1.getDisplayCountry()+"</p>");
		Locale l2 = new Locale("en","IN");
		out.println("<p> Language "+l2.getDisplayLanguage()+"</p>");
		out.println("<p> Country "+l2.getDisplayCountry()+"</p>");
		Locale l3=new Locale.Builder().setLanguage("en").setRegion("GB").build();
		out.println("<p> Language "+l3.getDisplayLanguage()+"</p>");
		out.println("<p> Country "+l3.getDisplayCountry()+"</p>");
		Locale l4=Locale.forLanguageTag("fr-FR");
		out.println("<p> Display Full "+l4.getDisplayName()+"</p>");
		Locale l5=Locale.JAPAN;
		out.println("<p> Display Full "+l5.getDisplayName()+"</p>");*/
		
		Locale l=request.getLocale();
		
		long number=5000000;
		NumberFormat f=NumberFormat.getInstance();
		out.println("<p>"+f.format(number)+"</p>");
		NumberFormat f1=NumberFormat.getInstance(new Locale("fr","FR"));
		out.println("<p>"+f1.format(number)+"</p>");
		NumberFormat f2=NumberFormat.getCurrencyInstance(new Locale("en","GB"));
		out.println("<p>"+f2.format(number)+"</p>");
		out.println("<p>"+f2.getCurrency()+"</p>");	
		Date cd= new Date();
		DateFormat d = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		out.println("<p> DATE "+d.format(cd)+"</p>");
		
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
