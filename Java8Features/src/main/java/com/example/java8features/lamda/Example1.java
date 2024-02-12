package com.example.java8features.lamda;

import java.util.function.Function;

public class Example1 {
	
	
	
public static void main(String[] args) {
	Function<Integer,Integer> f=i->i*i;
	System.out.println(f.apply(10));
	
	
	
}
}
