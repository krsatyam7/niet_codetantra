//Demonstrate the concept of type annotations in the JAVA programming language.
//Use annotation and read the string from user 
package q128;
import java.util.Scanner;
import java.lang.annotation.*
;@Target(ElementType.TYPE_USE)@interface TypeAnnoDemo
{}
public class MyClass{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter String : ");
		String x = obj.nextLine();
		@TypeAnnoDemo String s = x;
		System.out.println(s);
		myMethod();
	}
	static@TypeAnnoDemo int myMethod(){
		System.out.println("There is a use of annotation with the return type of the function");
		return 0;
	}
}
