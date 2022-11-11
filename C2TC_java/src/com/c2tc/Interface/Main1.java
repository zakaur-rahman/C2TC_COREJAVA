package com.c2tc.Interface;

public class Main1 implements Interface1, Interface2 {
	public void myMethod() {
		System.out.println("implementing more than one interfaces");
	}

	public static void main(String[] args) {
		Main1 obj = new Main1();
		obj.myMethod();

	}

}