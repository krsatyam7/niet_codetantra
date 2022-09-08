import java.util.Scanner;
class FirstClass{
	Scanner sc = new Scanner(System.in);
	void first(){
		System.out.print("Enter the first class string: ");
		String f = sc.nextLine();
		System.out.println("First class string is: "+f);
	}
}
class SecondClass extends FirstClass{
	Scanner x = new Scanner(System.in);
	void second(){
		System.out.print("Enter the second class string: ");
		String s = x.nextLine();
		System.out.println("Second class string is: "+s);
	}
}
class SingleInheritance{
	public static void main(String args[]){
		SecondClass call = new SecondClass();
		call.first();
		call.second();
	}
}
