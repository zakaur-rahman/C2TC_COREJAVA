package com.tns.di;

public class Student {
   //hard coding
   public String StudentName;
   public int id;

   public void setId(int id)
   {
       this.id = id;
   }
   public void setStudentName(String studentName)
   {
       this.StudentName =studentName;
   }
   public void disp()
   {
       System.out.println("student name is"+ " "+StudentName+" "+"id is"+" "+id);
   }

}