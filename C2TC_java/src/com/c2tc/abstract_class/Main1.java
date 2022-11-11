package com.c2tc.abstract_class;

import java.util.Scanner;

public class Main1 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String title = s.nextLine();
		My_movie m = new My_movie();
		m.setTitle(title);
		System.out.println("the title is :" + m.getTitle());

	}

}
