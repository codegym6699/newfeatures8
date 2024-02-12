package com.example.java8features.lamda;

import java.util.TreeSet;
import java.util.function.Predicate;

public class Ex1 {
	
    // Using Lambda Expression 
	public static void main(String[] args) {
		Thread thread=new Thread(()->{
			System.out.println("Welcome to thread start");
		});
		
		thread.start();
		
		Predicate<Integer> p=(i)->(i>10);
		System.out.println(p.test(0));
	
	TreeSet<Integer> t=new TreeSet<Integer>();
	t.add(4);
	t.add(1);	
	t.add(20);
	t.add(58);
	
	System.out.println("TreeSet==>"+t);
	
	}
   Runnable aa=()->System.out.println();
	
		
}
