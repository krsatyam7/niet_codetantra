package q36;
import java.util.*;
import java.util.stream.*;
public class CTJ36 {
	public static List<Integer> kth_employee (int k, int N, List<Integer> P, int M, List<Integer> Q) {
		List<Integer> result = new ArrayList<>();
		for (int queryTime : Q) {
			List<Integer> availableEmployees = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				if (P.get(i) >= queryTime) {
					availableEmployees.add(i + 1);
				}
			}
			if (availableEmployees.size() < k) {
				result.add(0);
			} else {
				result.add(availableEmployees.get(k - 1));
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		List<Integer> P = Arrays.stream(args[2].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int M = Integer.parseInt(args[3]);
		List<Integer> Q = Arrays.stream(args[4].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(kth_employee (k, N, P, M, Q).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
