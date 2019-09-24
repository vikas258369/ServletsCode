package com.ustywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")
public class MyFirstServelet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		
		resp.setContentType("text/html");   //type of file
		resp.setHeader("refresh", "1");    //to refresh the web page
		PrintWriter out = resp.getWriter(); //to print something on browser
		
		
		out.println("<html>");
		out.println("<head>");
	//	out.println("<meta http-equiv=\"refresh\"content=\"1\">");  //2nd way to refresh the web page
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Current System Date and Time<br/>");
		out.println(date);
		out.println("</h2>");
		
		out.println("<body>");
		out.println("</html>");
		out.println("</body>");
	
	}

}
