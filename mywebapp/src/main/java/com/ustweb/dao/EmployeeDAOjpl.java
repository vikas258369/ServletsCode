package com.ustweb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustweb.dto.EmployeeInfoBean;

public class EmployeeDAOjpl implements EmployeeDAO {

	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		
		EntityManagerFactory emf= null;
		EntityManager em = null;
		
		EmployeeInfoBean eb=null; 
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			
			
			eb = em.find(EmployeeInfoBean.class, id);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return eb;
		
	}

	@Override
	public boolean AddEmployee(int id,String name,int age,double salary,String designation) {
		EmployeeInfoBean eib = new EmployeeInfoBean();
		EntityManagerFactory emf= null;
		EntityManager em = null;
		EntityTransaction et = null;
		
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			eib.setEmpp_id(id);
			eib.setEmpName(name);
           eib.setAge(age);
           eib.setDesignation(designation);
           eib.setSalary(salary);
		
           if(em!=null) {
        	   et.begin();
               em.persist(eib);
               et.commit();
               return true;
           }
          
		}catch(Exception e) {
			et.rollback();
		}finally{
			
			em.close();
			emf.close();
		}
		
		return false;
	}

	@Override
	public boolean DeleteEmployee(int id) {
		
		EmployeeInfoBean eib = new EmployeeInfoBean();
		EntityManagerFactory emf= null;
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			EmployeeInfoBean eib1 = em.find(EmployeeInfoBean.class, id);
		
           if(em!=null) {
        	   et.begin();
               em.remove(eib1);
               et.commit();
               return true;
           }
          
		}catch(Exception e) {
			et.rollback();
		}finally{
			
			em.close();
			emf.close();
		}
		
		return false;
	}

	@Override
	public boolean UpdateEmployee(int id, String ename1, int age, double salary, String designation) {
		
		// = new EmployeeInfoBean();
		EntityManagerFactory emf= null;
		EntityManager em = null;
		EntityTransaction et = null;
		
		
		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			EmployeeInfoBean eib =em.find(EmployeeInfoBean.class, id);
			
			eib.setEmpp_id(id);
			eib.setEmpName(ename1);
           eib.setAge(age);
           eib.setDesignation(designation);
           eib.setSalary(salary);
		
           if(em!=null) {
        	   et.begin();
               em.persist(eib);
               et.commit();
               return true;
           }
          
		}catch(Exception e) {
			et.rollback();
		}finally{
			
			em.close();
			emf.close();
		}
		
		
		
		return false;
	}

}
