package strings;

import java.util.Scanner;

public class Errorhndle 
{

	public static void main(String[] args)
	{
		
		int nr, dr=0,result;
		Scanner s=new Scanner(System.in);
		
		
		 while (true) 
		 {
			 System.out.print("Enter numerator value :");
				
				nr=s.nextInt();
				System.out.print("Enter Denominator value :");
				
				dr=s.nextInt();
				
			try
			{
				result = nr / dr;
				System.out.println("The Result Value is :"+result);
				break;
				
			} 
			catch (Exception  e) {

			    //	e.printStackTrace();
				//  System.out.println(e);
				    System.out.println("Denominator value should be greater than Zero..........");
			}  
		}	
		
	}
	
}
