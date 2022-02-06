package Javaprca;


public class Calc {
	
	
	public  int plus (int x, int y)
	{
		 return x+y;
	}
	public  int min (int x, int y)
	{
		 return x-y;
	}
	public  int div (int x, int y)
	{
		 return x/y;
	}
	public  int multi (int x, int y)
	{
		 return x%y;
	}

	public static void main(String []arg)
	{
		Calc obj = new Calc();
		 int res1=obj.plus(10,20);
		 int res2=obj.min(2, 4);
		int res3=obj.div(3, 6);
		int res4=obj.multi(4, 6);
		
		
		System.out.println("Plus Answer "+res1);
		System.out.println("minus Answer "+res2);
		System.out.println( "Div Answer "+res3);
		System.out.println("multi Answer "+res4);
		
	}
	
	
}
