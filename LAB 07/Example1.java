public class Example1{
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			System.out.println(12/0);
		}
		catch(ArithmeticException e){
			System.out.println("Catch Block");
			System.out.println("MyException Occurred: This is My error Message");
		}
	}
}
