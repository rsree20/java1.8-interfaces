package com.java8.def;

public interface Left {

	public abstract void m1();
	default void showMessage() {
		System.out.println("Left show message method");
	}
}
