package com.java8.def;

public class Child implements Parent {

	public static void main(String[] args) {
		Parent.m1();
		Child.m1();
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		c.m1();
		
	}
}
