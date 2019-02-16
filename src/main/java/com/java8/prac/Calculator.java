package com.java8.prac;

public interface Calculator {

	public abstract int sum(int a, int b);
	public abstract int sub(int a, int b);

	default int multiplication(int a, int b) {
		return a*b;
	}
	
	public static double devide(int a, int b) {
		System.out.println("Devision started!!");
		return a/b;
	}
}
