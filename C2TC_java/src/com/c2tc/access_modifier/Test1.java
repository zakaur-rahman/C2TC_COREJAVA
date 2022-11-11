package com.c2tc.access_modifier;

public class Test1 {
	public int i = 10;

	public void show() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.show();
		System.out.println(t1.i);

	}

}