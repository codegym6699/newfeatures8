package com.example.java8features.lamda;
@FunctionalInterface
 interface Demo {

	//public void msg();
	public void h(int a,int b);
	
	public static void hello() {
		System.out.println("Hello");
	}
	
	}

class Hello  {

	
	public static String suma() {
		return "Sumalika" ;
	}
	
	public static void main(String[] args) {
		
		//Demo hello=()->System.out.println("Hello");
		//hello.msg();
		Demo i=(a,b)->System.out.println(a+b);;
		Demo.hello();
		i.h(10, 20);
		
		String suma =Hello. suma();
		System.out.println(suma);
		
	}
}
