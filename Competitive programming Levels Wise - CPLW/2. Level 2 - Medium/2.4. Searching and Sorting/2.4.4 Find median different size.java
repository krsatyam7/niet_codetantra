package q9266;
import java.util.*;
import java.util.stream.*;
public class CTJ9266 {
	public static int findMediandifferentSize(List<Integer> A, List<Integer> B) {
		int n = A.size();
		int m = B.size();
		int[] merged = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (A.get(i) <= B.get(j)) {
				merged[k++] = A.get(i++);
			} else {
				merged[k++] = B.get(j++);
			}
		}
		while (i < n) {
			merged[k++] = A.get(i++);
		}
		while (j < m) {
			merged[k++] = B.get(j++);
		}
		int mid = (n + m) / 2;
		if ((n + m) % 2 == 0) {
			return (merged[mid - 1] + merged[mid]) / 2;
		} else {
			return merged[mid];
		}
	}
	
	public static void main(String[] args) {
		List<Integer> A = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		List<Integer> B = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println( findMediandifferentSize(A, B));
	}
}
