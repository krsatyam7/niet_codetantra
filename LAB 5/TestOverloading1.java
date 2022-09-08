import java.util.*;
public class TestOverloading1{
	public void add(int a,int b){
		System.out.println("Addition of two numbers: "+(a+b));
	}
	public void add(int a,int b,int c){
		System.out.println("Addition of three numbers: "+(a+b+c));
	}
	public static void main(String args[]){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		TestOverloading1 obj = new TestOverloading1();
		obj.add(a,b);
		obj.add(a,b,c);
	}
}
