package q13420;
import java.util.*;
import java.util.stream.*;
public class CTJ13420 {
	public static long minTimeToPaint(int[] arr, int k) {
		long left = Arrays.stream(arr).max().orElse(0);
		long right = Arrays.stream(arr).sum();
		long result = right;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (canPaint(arr, k, mid)) {
				result = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}
	private static boolean canPaint(int[] arr, int k, long maxTime) {
		int painterCount = 1;
		long currentSum = 0;
		for (int length : arr) {
			currentSum += length;
			if (currentSum > maxTime) {
				painterCount++;
				currentSum = length;
				if (painterCount > k) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int k = Integer.parseInt(scanner.nextLine());
		int[] arr = Arrays.stream(scanner.nextLine().split(" "))
		.mapToInt(Integer::parseInt)
		.toArray();
		System.out.println(minTimeToPaint(arr, k));
	}
}
