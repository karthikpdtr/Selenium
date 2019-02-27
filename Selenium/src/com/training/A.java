package com.training;

public class A {
	
	 int x=100;

	 static String cname="Vmware";
	 
	 static A a;

	 void m1()

	 {
	  
	  int x=200;
	  System.out.println("I am in M1 Class");
	  System.out.println(x);
	  System.out.println(cname);

	}

	
	 //
	 public static void m2()

	 {
	   a=new A();
	   System.out.println(a.x);

	 }//

	  public static void main(String[] args)
	 
	  {

	   a=new A();
	  
	   a.m1();

	  

	}
}

