package q18795;
import java.util.Scanner;
public class CTJ18795 {
	public static int maxIntegerInGeneratedArray(int n) {
		int[] nums = new int[n + 1];
		if (n >= 0) {
			nums[0] = 0;
		}
		
		if (n >= 1) {
			nums[1] = 1;
		}
		
		for (int i = 1; i <= n / 2; i++) {
			if (2 * i <= n) {
				nums[2 * i] = nums[i];
			}
			if (2 * i + 1 <= n) {
				nums[2 * i + 1] = nums[i] + nums[i + 1];
			}
		}
		
		int max = nums[0];
		for (int i = 1; i <= n; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("");
		int n = scanner.nextInt();
		int result = maxIntegerInGeneratedArray(n);
		System.out.println(result);
		scanner.close();
	}
}
