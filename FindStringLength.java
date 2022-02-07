package Javaprca;

public class FindStringLength {

	 public static void main (String arg[])
	 {
		 String str[]= new String[]{"java", "Python",  "c", "c++"};
		 
		 int lengt= str.length;

		 System.out.println("String array length is: " + lengt);
		 
		 for(int i=0;i<lengt;i++)
		 {
			 System.out.print( " "+str[i]);
		 }
	 }
	
}
