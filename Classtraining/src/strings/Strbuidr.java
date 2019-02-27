package strings;

public class Strbuidr 
{

	public static void main(String[] args) 
	
	{
		StringBuilder s1=new StringBuilder("RC");

		 System.out.println(s1);
		 System.out.println(s1.hashCode());
		 
		StringBuilder s2=new StringBuilder("INFOTECH");
		System.out.println(s2.reverse());
		System.out.println(s2.hashCode());
		
		StringBuilder s4=s1.append(s2);
		
		System.out.println(s4);
		System.out.println(s4.capacity());
			 	
		}


	}


