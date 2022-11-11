package com.c2tc.Interface;

public class DefaultMethods implements Sayable {
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say();
		dm.sayMore("Work is Worship");

	}

}
