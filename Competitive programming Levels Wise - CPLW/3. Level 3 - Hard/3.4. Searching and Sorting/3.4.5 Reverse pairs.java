package q14782;
import java.util.*;
public class CTJ14782 {
	public static int countReversePairs(int[] nums) {
		return mergeSort(nums, 0, nums.length - 1);
	}
	private static int mergeSort(int[] nums, int left, int right) {
		if (left >= right) {
			return 0;
		}
		int mid = left + (right - left) / 2;
		int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
		int j = mid + 1;
		for (int i = left; i <= mid; i++) {
			while (j <= right && nums[i] > 2L * nums[j]) {
				j++;
			}
			count += (j - (mid + 1));
		}
		Arrays.sort(nums, left, right + 1);
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] input = scanner.nextLine().split(" ");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		System.out.println(countReversePairs(nums));
	}
}
