package com.training;

public class Cons1 
{

	int eno;
	String ename;
	float sal;

	/*public Cons1()
    {
   	 System.out.println("This is Default Constructor............");
    }*/
	
	public Cons1(int eno, String ename, float sal)
	
    {
		this(20, "Siva Rama");
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		System.out.println(" Constructor1 Emp Number:"+eno);
	    System.out.println(" Constructor 1 Emp Name:"+ename);
	    System.out.println(" Constructor 1 Emp Salary:"+sal);
	}

    public Cons1(int eno,String ename)
    {
    	this(30);
    	this.eno=eno;
    	this.ename=ename;
    	
    	System.out.println(" Constructor2 Emp Number:"+eno);
	    System.out.println(" Constructor2 Emp Name:"+ename);
    }

     public Cons1(int eno)
     {
    	 //this();
    	 this.eno=eno;
    	 
    	System.out.println(" Constructor3 Emp Number:"+eno);
 	    
     }
     
	public static void main(String[] args)
	{
		
		Cons1 c=new Cons1(100,"Ganesha",200000.0f);
		
	}
	
	
	
	
	
}
