package com.ustywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getEmplloyee")
public class getEmplloyee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id =req.getParameter("empId");
		int empid= Integer.parseInt(id);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		out.println("<html>");
		out.println("<body>");
		if(empid==101) {
			out.println("<h2>Emp details found:</h2>");
			
		}
		else {
			out.println("<h2>Emp details not found:</h2>");
		}
		out.println("<html>");
		out.println("<body>");
		
	}
}
