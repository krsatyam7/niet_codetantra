package q13;
public class CTJ13 {
	public static int CountUniqueBst(int N) {
		if (N <= 1) {
			return 1;
		}
		int[] dp = new int[N + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int nodes = 2; nodes <= N; nodes++) {
			for (int root = 1; root <= nodes; root++) {
				int left = dp[root - 1];
				int right = dp[nodes - root];
				dp[nodes] += left * right;
			}
		}
		return dp[N];
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		System.out.println(CountUniqueBst(N));
	}
}
