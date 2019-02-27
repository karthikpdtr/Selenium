package com.training;

public class Cons 
{
	int eno;
	String ename;
	float sal;
	

	public Cons(int i, String string) 
	{
		eno=i;
		ename=string;
		
	}
    public Cons()
    {
    	System.out.println("This is default Constructor");
    }

	public Cons(int eno, String ename, float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
	}
	public Cons(int eno) 
	{
		this.eno=eno;
	}
	public static void main(String[] args)
	{
		
		Cons c=new Cons(10,"Ganesh",20000.00f);
		System.out.println(c.eno);
		System.out.println(c.ename);
		System.out.println(c.sal);
		
		Cons c1=new Cons(11,"Siva Rama");
	      System.out.println(c1.eno);
          System.out.println(c1.ename);
          
        Cons c2=new Cons(30,"Amma");
        
          System.out.println(c2.eno);
          System.out.println(c2.ename);
          
         Cons c3=new Cons(100);
         System.out.println(c3.eno);
         System.out.println(c3.ename);
 		System.out.println(c3.sal);
 		
 		 
	}

}
