package com.example.java8features.lamda;

 class D1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello display msg");
		
	}

}

  class T {
	 public static void main(String[] args) {
		
		 D1 d=new D1();
		 Thread t=new Thread();
		 t.start();
	}
 }

