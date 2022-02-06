package Javaprca;

import java.util.Arrays;

public class FindLargestNumber {
	
	
	
	 public static int Largest(int A[])
	 { 
		 
		 Arrays.sort(A);
		 for(int i=1; i<A.length; i++)
		 {
			 System.out.println(" "+A[i]);
		 }
		
		return A[A.length-2];
		 
	 }
	public static void main(String []arg)
	{
		int A[]= {12,1,2,3,45,43};
		int res=Largest(A);
		System.out.println(res);
	}
	

}
