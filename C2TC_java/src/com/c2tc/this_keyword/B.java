package com.c2tc.this_keyword;

public class B {
	A4 obj;

	B(A4 obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println(obj.data);
	}

}
