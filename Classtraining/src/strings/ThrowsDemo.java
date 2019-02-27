package strings;

import java.io.BufferedReader;
import java.io.FileReader;

public class ThrowsDemo
{
	public static void m1() {
		
		try 
		{
			BufferedReader b=new BufferedReader(new FileReader("d://abdc.txt"));
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	
	{
		
		m1();
		

		
	}

	
		
	}

