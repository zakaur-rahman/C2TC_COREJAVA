package com.tns.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {
    public static void main(String[] args) {
       //injecting the value for dependency name(normal way)
       Student s=new Student();
       s.setStudentName("vivek");
       s.disp();
       ApplicationContext c1=new ClassPathXmlApplicationContext("");
       Student s1=c1.getBean("s1",Student.class); s1.disp();
       Student s2=c1.getBean("s2",Student.class); s2.disp();
       s1.disp();
    }
}