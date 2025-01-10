package q489;
import java.util.*;
public class CTJ489 {
	public static int KthdigitIthpermutation(int N, int K, int I) {
		List<String> permutations = new ArrayList<>();
		generatePermutations("", N, permutations);
		Collections.sort(permutations);
		String ithPermutation = permutations.get(I - 1);
		return Character.getNumericValue(ithPermutation.charAt(K - 1));
	}
	private static void generatePermutations(String current, int n, List<String> permutations) {
		if (current.length() == n) {
			permutations.add(current);
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (current.indexOf(String.valueOf(i)) == -1) {
				generatePermutations(current + i, n, permutations);
			}
		}
	}
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int K = Integer.parseInt(args[1]);
		int I = Integer.parseInt(args[2]);
		System.out.println(KthdigitIthpermutation(N, K, I));
	}
}
