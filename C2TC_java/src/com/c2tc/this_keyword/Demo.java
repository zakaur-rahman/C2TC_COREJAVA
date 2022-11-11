package com.c2tc.this_keyword;

public class Demo {
    Demo() {
        System.out.println("hello a");
    }

    Demo(int x) {
        this();
        System.out.println(x);
    }

}
