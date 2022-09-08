package q116;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Main ss=new Main(); //Creating Object of main class
		ss.mymethod();   //Invoking the method inside the main method
	}
	public void mymethod()     //Creating my own method
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");  //Here used print because we have to take input in same line
		String s=sc.nextLine();
		System.out.println("The entered string is: "+s);
	}
}
