package q11335;
public class ThrowExample {
	public static void main(String args[]) {
		System.out.println("Welcome to the Registration process!!");
		try {
			checkEligibilty(Integer.parseInt(args[0]),Integer.parseInt(args[1])); // Fill the missing code
			System.out.println("Have a nice day");
		}
		catch(Exception e) { // Fill the missing code
			System.out.println(e); // Fill the missing code
		}
	}
	static void checkEligibilty(int age, int weight) {
		if(age < 12 && weight < 40) { // Write the condition
			throw new ArithmeticException("Student is not eligible for registration"); // Fill the missing code
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}
}
