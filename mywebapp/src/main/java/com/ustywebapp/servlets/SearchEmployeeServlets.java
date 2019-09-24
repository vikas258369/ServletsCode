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
import com.ustweb.dto.EmployeeInfoBean;

@WebServlet("/searchEmp")
public class SearchEmployeeServlets extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      EmployeeDAO employeeInfoBean = new EmployeeDAOjpl();
		String empid = req.getParameter("emp_id");
		int empidd =Integer.parseInt(empid);
		System.out.println(empidd);
		  //employeeInfoBean1 = null;
		  EmployeeInfoBean employeeInfoBean1 = employeeInfoBean.searchEmployee(empidd);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
			if(employeeInfoBean1!=null) {
				out.println("<h3>Employee Present</h3>");
			out.println("Employee Id: "+employeeInfoBean1.getEmpp_id());
			out.println("Employee Name: "+employeeInfoBean1.getEmpName());
			}
			else {
				out.println("<h3>No Employee Present</h3>");
			}
			out.println("</body>");
		out.println("</html>");
		
		
		employeeInfoBean1.getEmpName();
		employeeInfoBean1.getAge();
	}
	
}
