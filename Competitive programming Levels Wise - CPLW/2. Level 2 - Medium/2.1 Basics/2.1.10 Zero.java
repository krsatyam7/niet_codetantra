package q13428;
import java.util.Scanner;
public class CTJ13428 {
	public static int countZeros(int N) {
		int zeroCount = 0;
		for (int number = 1; number <= N; number++) {
			zeroCount += String.valueOf(number).length() - String.valueOf(number).replace("0", "").length();
		}
		return zeroCount;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(countZeros(N));
	}
}
