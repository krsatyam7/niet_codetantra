package q11274;
class SuperClass {
	int value1, value2;
	void show(){
		System.out.println("This is super class show() method");
		System.out.println("value1 = "+this.value1);
	}
}

class SubClass extends SuperClass {
	int value3, value4;
	public SubClass(int a,int b,int c,int d){
		this.value1=a;
		this.value2=b;
		this.value3=c;
		this.value4=d;
	}
	void show(){
		System.out.println("This is sub class show() method");
		super.show();
		System.out.println("value2 from super class = "+ this.value2);
		System.out.println("value3 = "+this.value3);
		System.out.println("value4 = "+this.value4);
	}
}

public class AccessUsingSuper {
	public static void main(String[] args) {
		SubClass obj = new SubClass(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		obj.show();
	}
}
