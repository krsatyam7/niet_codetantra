package q15741;
import java.util.Scanner;
public class CTJ15741 {
	public static int trapWater(int N, int[] heights) {
		if (N <= 2) {
			return 0;
		}
		int[] leftMax = new int[N];
		int[] rightMax = new int[N];
		int waterTrapped = 0;
		leftMax[0] = heights[0];
		for (int i = 1; i < N; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
		}
		rightMax[N - 1] = heights[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
		}
		for (int i = 0; i < N; i++) {
			waterTrapped += Math.min(leftMax[i], rightMax[i]) - heights[i];
		}
		return waterTrapped;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] heights = new int[N];
		for (int i = 0; i < N; i++) {
			heights[i] = scanner.nextInt();
		}
		System.out.println(trapWater(N, heights));
		scanner.close();
	}
}
