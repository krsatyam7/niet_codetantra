package q18245;
import java.util.Scanner;
public class CTJ18245 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = N / 2; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
				if (j < i - 1) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= N / 2; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
				if (j < i - 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
