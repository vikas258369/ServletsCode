package com.ustywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustweb.dao.EmployeeDAOjpl;

@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String eid =	req.getParameter("id");
		int eid1 = Integer.parseInt(eid);
		
		String ename1 =	req.getParameter("empname");
		
		
		String eage =	req.getParameter("empage");
		int eage1 = Integer.parseInt(eage);
		
		String esal =	req.getParameter("empsalary");
		double esal1 = Double.parseDouble(esal);
		
		String edsignation =	req.getParameter("empdseg");
		
		EmployeeDAOjpl edj = new EmployeeDAOjpl();
		
		boolean condition = edj.UpdateEmployee(eid1, ename1, eage1, esal1, edsignation);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		if(condition) {
			out.println("<h2>Updated Successfully</h2>");
		}else {
			out.println("<h2>not Updarted sucessfully</h2>");
		}
		out.println("</body>");
		out.println("</html>");
		
		
	}
}
