package q18117;
import java.util.Scanner;
public class CTJ18117 {
	public static int lcm(int a, int b) {
		return (a * (b / gcd(a, b)));
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int countSubarraysWithLCM(int[] A, int n, int k) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			int currentLcm = 1;
			for (int j = i; j < n; j++) {
				currentLcm = lcm(currentLcm, A[j]);
				if (currentLcm > k) {
					break;
				}
				if (currentLcm == k) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		int result = countSubarraysWithLCM(A, n, k);
		System.out.println(result);
	}
}
