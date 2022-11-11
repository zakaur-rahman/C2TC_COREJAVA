package com.c2tc.control_statement;

public class Main1 {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j--) {
				System.out.println("* ");
			}
			System.out.println();
		}

	}

}
