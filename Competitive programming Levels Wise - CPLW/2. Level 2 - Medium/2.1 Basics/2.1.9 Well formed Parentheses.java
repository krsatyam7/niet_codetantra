package q18113;
import java.util.Scanner;
public class CTJ18113 {
	public static int countValidParentheses(int n) {
		return countHelper(n, n);
	}
	
	private static int countHelper(int open, int close) {
		if (open == 0 && close == 0) {
			return 1;
		}
		
		int count = 0;
		if (open > 0) {
			count += countHelper(open - 1, close);
		}
		if (close > open) {
			count += countHelper(open, close - 1);
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		int n = scanner.nextInt();
		int result = countValidParentheses(n);
		System.out.println(result);
		scanner.close();
	}
}
