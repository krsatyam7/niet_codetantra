package q18200;
import java.util.Scanner;
public class CTJ18200 {
	public static int minOperations(int N, int K, String S) {
		int currentGoodness = 0;
		int halfN = N / 2;
		for (int i = 0; i < halfN; i++) {
			if (S.charAt(i) != S.charAt(N - i - 1)) {
				currentGoodness++;
			}
		}
		if (currentGoodness == K) {
			return 0;
		}
		if (currentGoodness < K) {
			return K - currentGoodness;
		}
		int excessGoodness = currentGoodness - K;
		int changesNeeded = Math.max(0, excessGoodness);
		return changesNeeded;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		String S = scanner.next();
		int result = minOperations(N, K, S);
		System.out.println(result);
	}
}
