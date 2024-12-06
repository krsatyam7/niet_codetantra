package q9265;
import java.util.*;
import java.util.stream.*;
public class CTJ9265 {
	public static int findMedianSameSize(List<Integer> A, List<Integer> B) {
		int n = A.size();
		List<Integer> merged = new ArrayList<>(n * 2);
		int i = 0, j = 0;
		while (i < n && j < n) {
			if (A.get(i) <= B.get(j)) {
				merged.add(A.get(i));
				i++;
			} else {
				merged.add(B.get(j));
				j++;
			}
		}
		while (i < n) {
			merged.add(A.get(i));
			i++;
		}
		while (j < n) {
			merged.add(B.get(j));
			j++;
		}
		int mid1 = merged.get(n - 1);
		int mid2 = merged.get(n);
		return (mid1 + mid2) / 2;
	}
	
	public static void main(String[] args) {
		List<Integer> A = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		List<Integer> B = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println( findMedianSameSize(A, B));
	}
}
