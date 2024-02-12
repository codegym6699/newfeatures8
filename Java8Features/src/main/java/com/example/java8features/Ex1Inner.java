package com.example.java8features;

/**
 * @author vduppalapudi
 *
 */
public class Ex1Inner {

	/**
	 * @param b  we are taking the example like sms to sent sms using java 
	 * 
	 * 
	 */
	public void sms(int b) {
		System.out.println("Hello sms class");
	}
public static void main(String[] args) {
	
	new Ex1Inner() {
		{
			int a = 0;
			System.out.println("Hello Inner class()");
			sms(a);
		}
		
	};
	//sms(10);
	
	Thread t1=new Thread(new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	});
};
}
