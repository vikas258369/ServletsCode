package com.ustywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class createCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie ck = new Cookie("name", "vikas");
		resp.addCookie(ck);
		
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h2>Cookies created successfully</h2>");
	}
}
