package Javaprca;

public class Fibbonaci {
	public static void main(String[]arg)
	{
		int k=0;
		int a=1;
		int b=1;
		System.out.print("1 1");
		 
		
		while(k<=10)
		{
			
			k=a+b;
			a=b;
			b=k;
			
			System.out.print(" "+k);
		}
		
	}

}
