package q14766;
import java.util.*;
import java.util.stream.*;
public class CTJ14766 {
	public static int maxConsecutiveOnes(int[] B, int k) {
		int left = 0, maxLength = 0, zerosCount = 0;
		for (int right = 0; right < B.length; right++) {
			if (B[right] == 0) {
				zerosCount++;
			}
			while (zerosCount > k) {
				if (B[left] == 0) {
					zerosCount--;
				}
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] B = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int k = Integer.parseInt(scanner.nextLine());
		System.out.println(maxConsecutiveOnes(B, k));
	}
}
