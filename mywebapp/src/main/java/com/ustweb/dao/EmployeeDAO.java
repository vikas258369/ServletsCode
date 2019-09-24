package com.ustweb.dao;

import com.ustweb.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	EmployeeInfoBean searchEmployee(int id);
	
	boolean AddEmployee(int id,String ename1,int age,double salary,String designation);
	
	boolean DeleteEmployee(int id);
	
	boolean UpdateEmployee(int id,String ename1,int age,double salary,String designation);
}
