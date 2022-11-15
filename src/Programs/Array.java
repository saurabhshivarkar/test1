 package Programs;

import java.util.Arrays;

public class Array 
{
	public static void main(String[] args)
	
{
		int ar1[]= {20,50,60};
		int ar2[]= {30,40,90};
		int ar3[]= {20,50,60};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar2, ar3));
		System.out.println(Arrays.equals(ar1, ar3));
	}

}
