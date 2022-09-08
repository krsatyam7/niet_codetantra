package q11329;
public class Division{
	public static void main(String args[]){
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
try{
	int d = number1/number2;
	System.out.println("Result = "+d);
}
catch(ArithmeticException e){
	System.out.println("Exception caught : divide by zero occurred");
}}}
