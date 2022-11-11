package com.c2tc.control_statement;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			for (int j = i; j <= 5; j++) {
				if (j == 4) {
					break;
				}
				System.out.println(j);
			}
		}

	}

}
