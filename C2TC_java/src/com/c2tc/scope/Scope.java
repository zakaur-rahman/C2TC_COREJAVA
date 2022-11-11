package com.c2tc.scope;

public class Scope {
	public static void main(String[] args) {
		int outer = 1;

		{
			int inner = 2;
			System.out.println(inner);
			System.out.println(outer);

		}
		int inner = 3;
		System.out.println(inner);
	}

}
