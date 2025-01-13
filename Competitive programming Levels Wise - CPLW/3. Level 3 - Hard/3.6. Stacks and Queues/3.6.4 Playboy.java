package q13422;
import java.util.Scanner;
public class CTJ13422 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		System.out.println(findPlayboy(mat, n));
	}
	public static int findPlayboy(int[][] mat, int n) {
		int candidate = 0;
		for (int i = 1; i < n; i++) {
			if (mat[candidate][i] == 1) {
				candidate = i;
			}
		}
		for (int i = 0; i < n; i++) {
			if (i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0)) {
				return -1;
			}
		}
		return candidate;
	}
}
