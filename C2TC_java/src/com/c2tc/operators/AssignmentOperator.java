package com.c2tc.operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		a += 5;
		b *= 4;
		c += a * b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}