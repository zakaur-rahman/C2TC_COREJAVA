package com.tns.springioc;

import org.springframework.context.ApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		/*Airtel a=new Airtel();
		  a.calling();
		  a.data();
		  
		  Jio b=new Jio();
		  b.calling();
		  b.data();
		 */
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		/*
		Airtel a=(Airtel) con.getBean("airtel");
		a.calling();
		a.data();
		*/
		Sim s=con.getBean("sim",Sim.class);
		s.calling();
		s.data();
	}
}