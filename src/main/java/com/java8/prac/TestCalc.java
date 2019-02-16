package com.java8.prac;

public class TestCalc {

	public static void main(String[] args) {
		Calculator cal = new SamsungCalc();
		int c = cal.sum(10, 20);
		System.out.println("The sum is : " + c);
		int d = cal.sub(20, 15);
		System.out.println("The sub is : " + d);
		
		int mul = cal.multiplication(10, 20);
		System.out.println("The multiplication is : " + mul);
		
	}
}
