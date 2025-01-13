package q14880;
import java.util.*;
public class CTJ14880 {
	public static long sumOfMaxElements(int[] arr) {
		int n = arr.length;
		long totalSum = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				int maxIndex = stack.pop();
				int left = stack.isEmpty() ? -1 : stack.peek();
				int right = i;
				long contribution = (maxIndex - left) * (right - maxIndex) * arr[maxIndex];
				totalSum += contribution;
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			int maxIndex = stack.pop();
			int left = stack.isEmpty() ? -1 : stack.peek();
			int right = n;
			long contribution = (maxIndex - left) * (right - maxIndex) * arr[maxIndex];
			totalSum += contribution;
		}
		return totalSum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		System.out.println(sumOfMaxElements(arr));
		scanner.close();
	}
}
