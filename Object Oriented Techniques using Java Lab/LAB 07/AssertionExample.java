//program to implement the concept of Assertions in JAVA programming language.
//use command prompt for enabling assertions and compilation can be done using cmd
package q122;
import java.util.Scanner;
public class AssertionExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int value=sc.nextInt();
		assert value>=0:"Not valid";
		System.out.println("value is "+value);
	}
}
