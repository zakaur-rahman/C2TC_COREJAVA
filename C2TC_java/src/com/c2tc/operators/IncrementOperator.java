package com.c2tc.operators;

public class IncrementOperator {
	public static void main(String[] args) {
		int numA = 5;
		int numB = 10;
		int numC = 0;
		numC = --numC + numB--;
		System.out.println(numA);
		System.out.println(numB);
		System.out.println(numC);

	}

}
