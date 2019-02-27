package com.training;

public class ChildClass extends Cons1
{
	 int x;

	public ChildClass(int x)
	{
		super(100,"Ganesha",200000.0f);
		this.x=x;
		System.out.println(this.x);	
	}
		
	public static void main(String[] args) 
	{
		
      ChildClass cc=new ChildClass(1);
      
	}

}
