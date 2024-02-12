package com.example.java8features.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSort {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpId(1078);
		emp.setEmpName("Zadhu");
		emp.setEmpAddr("Bang");
		
		Employee emp2=new Employee();
		emp2.setEmpId(1076);
		emp2.setEmpName("Sankar");
		emp2.setEmpAddr("Hyd");
		
		ArrayList<Employee> alEmp=new ArrayList<Employee>();
		alEmp.add(emp);
		alEmp.add(emp2);
		
		System.out.println("Default output"+alEmp);
		
		
		/*
		 * Comparator<Employee> customeSort = (e1, e2) -> e1.getEmpId() < e2.getEmpId()
		 * ? -1 : e1.getEmpId() > e2.getEmpId() ? 1 : 0;
		 * 
		 */	
		Comparator<Employee> customeSort = (e1,e2)-> e1.getEmpName().compareTo(e2.getEmpName());
				
				
	   Collections.sort(alEmp,customeSort);
	   System.out.println(alEmp);
	   
	   
	   
		
	}
}
