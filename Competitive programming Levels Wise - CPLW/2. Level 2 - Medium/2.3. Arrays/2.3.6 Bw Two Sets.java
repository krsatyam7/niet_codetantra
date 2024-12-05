package q14919;
import java.util.*;
public class CTJ14919 {
	public static int getNumbersBetween(int[] a, int[] b) {
		int count = 0;
		int lcm = findLCM(a);
		int gcd = findGCD(b);
		for (int i = lcm; i <= gcd; i += lcm) {
			if (gcd % i == 0) {
				count++;
			}
		}
		return count;
	}
	
	private static int findLCM(int[] arr) {
		int lcm = arr[0];
		for (int i = 1; i < arr.length; i++) {
			lcm = lcm(lcm, arr[i]);
		}
		return lcm;
	}
	
	private static int lcm(int a, int b) {
		return (a * b) / findGCD(a, b);
	}
	
	private static int findGCD(int[] arr) {
		int gcd = arr[0];
		for (int i = 1; i < arr.length; i++) {
			gcd = findGCD(gcd, arr[i]);
		}
		return gcd;
	}
	
	private static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 0; j < m; j++) {
			b[j] = scanner.nextInt();
		}
		int result = getNumbersBetween(a, b);
		System.out.println(result);
	}
}
