package q18116;
import java.util.*;
import java.util.stream.*;
public class CTJ18116 {
	public static int countSubarraysWithGCD(int[] A, int k) {
		int count = 0;
		int n = A.length;
		for (int start = 0; start < n; start++) {
			int currentGCD = 0;
			for (int end = start; end < n; end++) {
				currentGCD = gcd(currentGCD, A[end]);
				if (currentGCD == k) {
					count++;
				} else if (currentGCD < k) {
					break;
				}
			}
		}
		return count;
	}
	
	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int k = Integer.parseInt(scanner.nextLine());
		System.out.println(countSubarraysWithGCD(A, k));
	}
}
