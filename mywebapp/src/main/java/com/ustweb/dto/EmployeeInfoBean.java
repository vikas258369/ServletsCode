

package com.ustweb.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name="employee_info")
public class EmployeeInfoBean {

	@Id
	@Column(name="emp_id")
	private int empp_id;
	@Column(name="emp_name")
	private String empName;
	@Column(name="age")
	private int age;
	@Column(name="salary")
	private double salary;
	@Column(name="designation")
	private String designation;
	public int getEmpp_id() {
		return empp_id;
	}
	public void setEmpp_id(int empp_id) {
		this.empp_id = empp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}