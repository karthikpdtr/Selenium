package com.training;

public class AdSub 
{

	int a,b,c;
	
	public AdSub(int a, int b) 
	{
		this.a=a;
		this.b=b;
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
		AdSub ad=new AdSub(10,20);
		ad.add();
		ad.sub();

	}

}
