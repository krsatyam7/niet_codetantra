package q18243;
import java.util.Scanner;
public class CTJ18243 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = N / 2; i >= 1; i--) {
			printLine(i+2);
		}
		for (int i = 1; i <= N / 2; i++) {
			printLine(i+2);
		}
	}
	private static void printLine(int num) {
		StringBuilder line = new StringBuilder();
		for (int j = 2; j < num; j++) {
			line.append(num);
			if (j < num - 1) {
				line.append("*");
			}
		}
		System.out.println(line);
	}
}
