package com.example.java8features.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setEmpAddr("Hyd");
		employee.setEmpId(5);
		employee.setEmpName("Jai");
		System.out.println(employee);
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(70);
		al.add(50);
		al.add(60);
		
		System.out.println(al);
		//Collections.sort(al);
		
		//System.out.println(al);
		
		Comparator<Integer> cm=(a,b)-> a<b?1:a>b?-1:0;
		Collections.sort(al,cm);
		
		System.out.println(al);
		
		
		
		
	}
}
