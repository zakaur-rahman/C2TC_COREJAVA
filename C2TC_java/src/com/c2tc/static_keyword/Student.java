package com.c2tc.static_keyword;

public class Student {
	private String name;
	private long mobile;
	private String email;
	private static String college = "SIET";
	private float cgpa;

	public Student(String name, long mobile, String email, float cgpa) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.cgpa = cgpa;
	}

	static void change() {
		college = "shri devi";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCollege() {
		return college;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public void display() {
		System.out.println(name + "  " + mobile + "  " + email + "  " + college + "  " + cgpa);
	}

}