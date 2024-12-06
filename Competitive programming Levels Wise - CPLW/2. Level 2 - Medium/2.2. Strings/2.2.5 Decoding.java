package q13217;
import java.util.*;
public class CTJ13217 {
	public static int numDecodings(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0') {
			return 0;
		}
		int MOD = 1000000007;
		int n = s.length();
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		for (int i = 2; i <= n; i++) {
			int oneDigit = Integer.parseInt(s.substring(i - 1, i));
			if (oneDigit >= 1) {
				dp[i] = (dp[i] + dp[i - 1]) % MOD;
			}
			int twoDigits = Integer.parseInt(s.substring(i - 2, i));
			if (twoDigits >= 10 && twoDigits <= 26) {
				dp[i] = (dp[i] + dp[i - 2]) % MOD;
			}
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(numDecodings(input));
	}
}
