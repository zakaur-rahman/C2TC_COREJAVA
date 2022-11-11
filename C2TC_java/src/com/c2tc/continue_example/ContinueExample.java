package com.c2tc.continue_example;

public class ContinueExample {
	public static void main(String[] args) {
		int lim = 10;
		int sum = 0;
		for (int i = 1; i <= lim; i++) {
			if (i % 4 == 0) {
				continue;
			}
			sum += i; // sum=sum+i = 0+1=1
		}
		System.out.println(sum);
	}

}
