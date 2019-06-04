package quiz5and6;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 studying("name");
		 studying1("ROMIL");
		
		
		 
	}
	public static String studying(String name)
	{
		Scanner keyboard=new Scanner(System.in);
		String name1=keyboard.nextLine();
		if(name1.equals("Shivam"))
		{
		System.out.println(name1 + " is studying");
		}
		else if (name1.equals("null"));
		{
		System.out.println("Nobody is studying");
		}
	
		return " ";
	}
	public static String studying1(String name2)
	{
		  String Str = new String("ROMIL IS STUDYING");

	      System.out.print("Return Value :" );
	      System.out.println(Str.toUpperCase() );
	      return name2;
	}
		
	
	

}
