package com.tns.springioc;

public class Airtel implements Sim {
	public Airtel()
	{
		System.out.println("Calling from airtel constriuctor");
	}
	public void calling() {
		System.out.println("Calling using airtel sim");
	}
	public void data() {
		System.out.println("data using airtel sim");
	}

}
