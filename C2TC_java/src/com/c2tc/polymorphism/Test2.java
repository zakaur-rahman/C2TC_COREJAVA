package com.c2tc.polymorphism;

public class Test2 {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		System.out.println("SBI Rate Of Interest:" + s.getRateOfInterest());
		System.out.println("ICICI Rate Of Interest:" + i.getRateOfInterest());

	}

}
