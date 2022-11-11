package com.c2tc.Interface;

public class Student implements Readable, Writeable {
	public void reads() {
		System.out.println("student reads..");
	}

	public void writes() {
		System.out.println("student  writes...");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.reads();
		s.writes();

	}

}
