package Programs;

public class whitespaces 
{
	public static void main(String[] args)
	{
		String org="a gv j n";
		int count=0;
		
		for(int i=0;   i<=org.length()-1;  i++)
		{
			char value=org.charAt(i);
			
			if(value==' ')
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		
		
	}

}
