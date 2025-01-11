package q13598;
import java.util.Scanner;
public class CTJ13598 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String P = scanner.nextLine();
		String Q = scanner.nextLine();
		int m = P.length();
		int n = Q.length();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= n; j++) {
			dp[0][j] = j;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (P.charAt(i - 1) == Q.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
				}
			}
		}
		System.out.println(dp[m][n]);
		scanner.close();
	}
}
