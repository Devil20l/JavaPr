package Javaprca;

public class ReversePyramid {
	public static void main(String arg[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
