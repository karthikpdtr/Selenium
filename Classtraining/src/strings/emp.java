package strings;

import java.util.Scanner;

public class emp  extends Exception
{
	
	public emp(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		
		while (true) 
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Alpha Numeric Value :");
			String val = s.nextLine();
			try {
				if (val.length() != 10) {
					try {
						throw new emp("Value Should be 10 Alpha Numeric");
					} catch (emp e) {

						e.printStackTrace();
					}

				}

				else {
					System.out.println("The value is............:" + val);
					break;
				} 
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				
			}  
			finally 
			{
				System.out.println(" I Am Final Block.........");
			}
	
		}   
		
	}	
}
