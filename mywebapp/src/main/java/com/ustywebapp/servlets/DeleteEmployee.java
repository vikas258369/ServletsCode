package com.ustywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustweb.dao.EmployeeDAO;
import com.ustweb.dao.EmployeeDAOjpl;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empid = req.getParameter("id");
		int empid1 = Integer.parseInt(empid);
		
		
		EmployeeDAOjpl ed = new EmployeeDAOjpl();
		boolean condition = ed.DeleteEmployee(empid1);
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		if(condition) {
			out.println("<h2>Employee Deleted</h2>");
		}else {
			out.println("<h2>not added Successfull</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}
	
}
