package q11330;
public class MyFinallyBlock {
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Float c = Float.parseFloat(args[2]);
		Float d = Float.parseFloat(args[3]);
		try{
			System.out.println("Result of integer values division : "+a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Inside the 1st catch block");
		}
		finally{
			System.out.println("Inside the 1st finally block");
		}
		try{
			System.out.println("Result of float values division : "+c/d);
		}
		catch(ArithmeticException e){
			System.out.println("Inside of the 2nd catch block");
		}
		finally{
			System.out.println("Inside the 2nd finally block");
		}
	}
	
}
