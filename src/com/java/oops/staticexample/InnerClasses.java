package com.java.oops.staticexample;

public class InnerClasses {
   static class Test{
       String name;

       public Test(String name) {
           this.name = name;
       }
   }


    public static void main(String[] args) {
       Test a= new Test("sujith");
       Test b=new Test("sujith1");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
//static class A{
//
//}
