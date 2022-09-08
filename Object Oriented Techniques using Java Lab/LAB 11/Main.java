import java.util.Scanner;
class Test<T>{
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getObject(){
		return this.obj;
	}
}
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		Test<String> sObj=new Test<String>(str);
		System.out.println("The string is: "+sObj.getObject());
		System.out.print("Enter an integer: ");
		int a = sc.nextInt();
		Test <Integer> iObj = new Test<Integer>(a);
		System.out.println("The integer is: "+iObj.getObject());
	}
}
