package com.java8.def;

public class InterfImpl implements Left, Right{

	@Override
	public void m1() {
		System.out.println("m1 from Test class");
	}
	
	@Override
	public void showMessage() {
		System.out.println("overridden");
	}
}
