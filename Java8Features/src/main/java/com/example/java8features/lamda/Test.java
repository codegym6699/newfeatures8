package com.example.java8features.lamda;

public class Test {
	
	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("Hello");
		};
		
		Thread t=new Thread(r);
		t.start();
	}

}
