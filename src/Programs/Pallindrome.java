package Programs;

public class Pallindrome 
{
	
	public static void main(String[] args) 
	{
		String org="mom";
		String rev="";
		
		for(int i=org.length()-1;  i>=0;   i--)
		{
			     rev=rev+ org.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("Given string is pallindrome");
			
		}
		else
		{
			System.out.println("Given string is not pallindrome ");
		}
		
	}

}
