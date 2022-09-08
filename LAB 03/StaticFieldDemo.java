package q11291;
import java.util.Scanner;
class StaticFieldDemo{
	static int a;
	int b,c;
	StaticFieldDemo(int b,int c)
	{
		this.b=b;
		this.c=c;
	}
	public void getValues()
	{
		System.out.println("a1 = A [instanceField = " + this.b +","+" aStaticField = "+StaticFieldDemo.a + "]");
		System.out.println("a2 = A [instanceField = " + this.c +","+" aStaticField = "+StaticFieldDemo.a + "]");
		System.out.println("A"+"."+"aStaticField = "+StaticFieldDemo.a);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a StaticField number");
		a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		StaticFieldDemo s = new StaticFieldDemo(b,c);
		s.getValues();
	}
}
