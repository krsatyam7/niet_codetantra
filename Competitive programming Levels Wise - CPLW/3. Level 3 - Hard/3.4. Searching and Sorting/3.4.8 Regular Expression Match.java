package q14908;
import java.util.*;
public class CTJ14908 {
	public static int isMatch(String A, String B) {
		int m = A.length();
		int n = B.length();
		boolean[][] dp = new boolean[m + 1][n + 1];
		dp[0][0] = true;
		for (int j = 1; j <= n; j++) {
			if (B.charAt(j - 1) == '*') {
				dp[0][j] = dp[0][j - 1];
			}
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (B.charAt(j - 1) == '*') {
					dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
				} else if (B.charAt(j - 1) == '?' || A.charAt(i - 1) == B.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
			}
		}
		return dp[m][n] ? 1 : 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		System.out.println(isMatch(A, B));
	}
}
