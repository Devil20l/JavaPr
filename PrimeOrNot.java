package Javaprca;

public class PrimeOrNot {

	public static void main(String arg[])
	{
	int  num=29;
	boolean isprime=true;
	
	for(int i=2; i<num; i++)
	{
		while(num%i==0)
		{
			isprime= false;
			break;
		}
	}
           if( isprime)
           {
        	   System.out.println("this a prime number "+num);
           }
           else {
        	   System.out.println("This numbrer is not prime "+num);
           }
	}
	}