package com.c2tc.control_statement;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			for (int j = i; j <= 5; j++) {
				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}

	}

}