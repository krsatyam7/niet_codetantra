package q9288;
import java.util.*;
import java.util.stream.*;
public class CTJ9288 {
	public static long countInversions(List<Long> A) {
		long[] temp = new long[A.size()];
		return mergeSortAndCount(A, temp, 0, A.size() - 1);
	}
	
	private static long mergeSortAndCount(List<Long> A, long[] temp, int left, int right) {
		long count = 0;
		if (left < right) {
			int mid = (left + right) / 2;
			count += mergeSortAndCount(A, temp, left, mid);
			count += mergeSortAndCount(A, temp, mid + 1, right);
			count += mergeAndCount(A, temp, left, mid, right);
		}
		return count;
	}
	
	private static long mergeAndCount(List<Long> A, long[] temp, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		long count = 0;
		while (i <= mid && j <= right) {
			if (A.get(i) <= A.get(j)) {
				temp[k++] = A.get(i++);
			} else {
				temp[k++] = A.get(j++);
				count += (mid - i + 1);
			}
		}
		while (i <= mid) {
			temp[k++] = A.get(i++);
		}
		while (j <= right) {
			temp[k++] = A.get(j++);
		}
		for (i = left; i <= right; i++) {
			A.set(i, temp[i]);
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Long> A = Arrays.stream(args[0].split(",")).map(s -> Long.parseLong(s)).collect(Collectors.toList());
		System.out.println(countInversions(A));
	}
}
