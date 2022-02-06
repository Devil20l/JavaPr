package Javaprca;

public class FindDuplicate {

	public static void main(String []arg)
	{
		int arr[]= {1,2,4,5,2,7};
	
		for(int i =1; i<arr.length-1; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{     
					
				  System.out.println( "this is a duplicate number " +arr[j]);
				}
			}
		}
	}
}
