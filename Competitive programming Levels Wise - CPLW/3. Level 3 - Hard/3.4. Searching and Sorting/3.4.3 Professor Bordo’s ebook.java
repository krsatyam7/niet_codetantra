package q13419;
import java.util.*;
import java.util.stream.*;
public class CTJ13419 {
	public static long allocateBooks(List<Integer> A, int M) {
		int N = A.size();
		if (N < M) return -1;
		long left = 0;
		long right = 0;
		for (int pages : A) {
			left = Math.max(left, pages);
			right += pages;
		}
		long result = right;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (canAllocate(A, mid, M)) {
				result = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}
	private static boolean canAllocate(List<Integer> A, long maxPages, int M) {
		int studentCount = 1;
		long currentPages = 0;
		for (int pages : A) {
			currentPages += pages;
			if (currentPages > maxPages) {
				studentCount++;
				currentPages = pages;
				if (studentCount > M) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		List<Integer> A = Arrays.stream(scanner.nextLine().split(" "))
		.map(Integer::parseInt)
		.collect(Collectors.toList());
		int M = Integer.parseInt(scanner.nextLine());
		System.out.println(allocateBooks(A, M));
	}
}
