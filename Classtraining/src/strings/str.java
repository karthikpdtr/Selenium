package strings;

public class str
{

	public static void main(String[] args)
	{
		
		String s1="RC";

		 System.out.println(s1);
		 System.out.println(s1.hashCode());
		 
		String s2="INFOTECH";
		System.out.println(s2);
		System.out.println(s2.endsWith("r"));
		
		s1=s1+s2;
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		 
		 
		 
	}

}