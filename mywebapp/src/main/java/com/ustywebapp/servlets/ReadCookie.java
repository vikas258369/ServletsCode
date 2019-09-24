package com.ustywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie[] ck = req.getCookies();
	
	PrintWriter out = resp.getWriter();
	out.println("<head>");
	out.println("<body>");
	
	if(ck!=null) {
	for (Cookie cookie : ck) {
		out.println("<h3>Cookie name="+cookie.getName()+"</h3>");
		out.println("<h3>Cookie name="+cookie.getValue()+"</h3>");
	}
	}else {
		out.println("<h2>Cooikies not prsesnt</h2>");
	}
	out.println("</head>");
	out.println("</body>");
	}
}
