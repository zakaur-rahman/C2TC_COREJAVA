package com.c2tc.this_keyword;

public class Hello {
    Hello() {
         this(5);
         System.out.println("hello a");
    }

    Hello(int x) {
         System.out.println(x);
    }

}
