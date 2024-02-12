package com.example.java8features.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.example.java8features.Demo.DemoNew;

public class IntDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(45);
		al.add(6);
		
		Comparator<Integer> in=(i1,i2)-> i1<i2?-1:i1>i2?1:0;
		
		Collections.sort(al,in);
		
		//System.out.println(al);
		Collections.sort(al,(i1,i2)->i1<i2?1:i1>i2?-1:0);
		//System.out.println(al);
		
		
		/*Runnable r=()->System.out.println("Oyee Gemini ");
		
		
		Thread t=new Thread(r);
		
		t.start();*/
		
		Thread tt=new Thread(()->{
			System.out.println(" Hello Thread");
		});
		tt.start();
		
		// using static runnable interface calling with help
		//of Thread
		Thread t5=new Thread(r2);
		t5.start();
		
		// instace method way calling runnnable method using objec
		IntDemo id=new IntDemo();
		id.callRunnableMethod();
		
		
	}
	public void callRunnableMethod() {
		Thread t5=new Thread(r4);
		t5.start();
		Thread ttt=new Thread(); // it accepts bcz Zero param Const
	}
	 static Runnable r2=new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable inner using static ");
		}
		
	};
	
	 Runnable r4=new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable inner with instance method");
		}
		
	};
}
