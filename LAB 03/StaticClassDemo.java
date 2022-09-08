package q11293;
import java.util.Scanner;
class StaticClassDemo{
	int a,b;
	StaticClassDemo(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void getValues()
	{
		System.out.println("a1 = A [value = " + this.a+"]");
		System.out.println("a2 = A [value = " + this.b+"]");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		StaticClassDemo s = new StaticClassDemo(a,b);
		s.getValues();
	}
}
