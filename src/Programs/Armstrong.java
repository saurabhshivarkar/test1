package Programs;

public class Armstrong
{
	public static void main(String[] args) {
		
	
	int org=153;
	int num=0;
	
	
	for(int i=org;   i>0;  i=i/10)
	{
		int rem=i % 10;
		num=num+(rem*rem*rem);
	}
	
	if(org==num)
	{
		System.out.println("Given no is Armstrong");
	}
	else {
		System.out.println("Given no is not Armstrong");
	}
	
	
	
	
	
	}

}
