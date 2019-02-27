package com.training;

public class variable
{

	int x=100; // Instance or non-static or global variables
	static String cname="vmware"; // Static variable
	
	void m1()
	{
		System.out.println(x);
		System.out.println(cname);
	}
	
	
	public static void main(String[] args)
	
	{
		variable obj=new variable();
		obj.m1();
		
		
	}
	
	
	}
	

