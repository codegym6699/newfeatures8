package com.example.java8features.lamda;

 interface DD {

    default void m2() {
    	System.out.println("default and php");
    }
    

}
 interface mm{
	 default void m2() {
	    	System.out.println("default -mm");
	    }
 }

 public class Dem implements DD,mm{

	
	 public void m2() {
		 DD.super.m2();
		 mm.super.m2();
	 }
	
	public static void main(String[] args) {
		Dem d=new Dem();
		d.m2();
		
	}
	
}
