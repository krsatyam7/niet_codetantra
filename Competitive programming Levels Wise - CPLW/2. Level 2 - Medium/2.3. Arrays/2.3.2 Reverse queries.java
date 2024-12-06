package q44;
import java.util.*;
import java.util.stream.*;
public class CTJ44 {
	public static List<Integer> ArrayOperations(List<Integer> Arr, List<Integer> Queries) {
		int m = Queries.size() / 2;
		for (int i = 0; i < m; i++) {
			int start = Queries.get(2 * i);
			int end = Queries.get(2 * i + 1);
			reverseSubarray(Arr, start, end);
		}
		return Arr;
	}
	
	private static void reverseSubarray(List<Integer> Arr, int start, int end) {
		while (start < end) {
			int temp = Arr.get(start);
			Arr.set(start, Arr.get(end));
			Arr.set(end, temp);
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		List<Integer> Queries = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(ArrayOperations(Arr, Queries).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
