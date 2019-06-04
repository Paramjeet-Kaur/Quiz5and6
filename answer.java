package quiz5and6;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 studying("name");
		
		
		 
	}
	public static String studying(String name)
	{
		Scanner keyboard=new Scanner(System.in);
		String name1=keyboard.nextLine();
		if(name1.equals("Shivam"))
		{
		System.out.println(name1 + " is studying");
		}
		//else if (name1.equals("null"));
		//{
		//System.out.println("Nobody is studying");
		//}
		return " ";
	}
	

}
