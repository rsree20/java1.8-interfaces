package com.java8.def;

public interface Right {

	public abstract void m1();
	
	default void showMessage() {
		System.out.println("Right show message method");
	}
}
