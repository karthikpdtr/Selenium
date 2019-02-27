package com.training;

import java.util.Scanner;

public class Sc 
{
	int a,b,c;
	

	public Sc(int d, int e)
	{
		this.a=d;
		this.b=e;
	}

	public void add()
	{
		c=a+b;
		System.out.println("Addition : "+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Subtraction :"+ c);
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value for A");
		int d=s.nextInt();
		System.out.println("Enter Value for B");
		int e=s.nextInt();
		 
	    Sc ss=new Sc(d,e);
	     ss.add();
	     ss.sub();
		
    }
}