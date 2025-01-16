package q13418;
import java.util.Scanner;
public class CTJ13418 {
	public static int maxHoneyPots(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = 1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		int maxLength = 0;
		for (int length : dp) {
			maxLength = Math.max(maxLength, length);
		}
		return maxLength;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		int result = maxHoneyPots(arr);
		System.out.println(result);
	}
}
