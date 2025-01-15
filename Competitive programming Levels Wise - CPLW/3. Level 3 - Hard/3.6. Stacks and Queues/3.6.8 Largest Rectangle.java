package q14030;
import java.util.*;
public class CTJ14030 {
	public static int largestRectangleArea(int[] buildingHeights) {
		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;
		int index = 0;
		while (index < buildingHeights.length) {
			if (stack.isEmpty() || buildingHeights[stack.peek()] <= buildingHeights[index]) {
				stack.push(index++);
			} else {
				int top = stack.pop();
				int area = buildingHeights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
				maxArea = Math.max(maxArea, area);
			}
		}
		while (!stack.isEmpty()) {
			int top = stack.pop();
			int area = buildingHeights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] buildingHeights = new int[n];
		for (int i = 0; i < n; i++) {
			buildingHeights[i] = scanner.nextInt();
		}
		System.out.println(largestRectangleArea(buildingHeights));
		scanner.close();
	}
}
