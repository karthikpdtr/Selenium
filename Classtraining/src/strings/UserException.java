package strings;

import java.util.Scanner;

public class UserException extends Exception
{

	public UserException(String string)
	{
		super(string);
	}

	public static void main(String[] args)
	{
		
	
		while (true) 
		{
			Scanner s=new Scanner(System.in);
			System.out.print("Enter The AlphaNumeric Value :");
			
			String val=s.nextLine();
			
			try {
				if (val.length() != 10) 
				{

					try {
						throw new UserException("Value Should be 10 Digit Alpha Numeric");
					} 
					catch (UserException e) 
					{

						e.printStackTrace();
					}
				}				

				else 
				{
					System.out.println(val);
					break;
					
				}
			} 
			
			    catch (Exception e) 
			{
				
				e.printStackTrace();
			} 
			
			finally
			{
				System.out.println("I am Final Block...............");
			}
		}
		
		    
	
		
	}

}

