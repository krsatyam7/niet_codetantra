package q1598;
import java.util.*;
import java.util.stream.*;
public class CTJ1598 {
	public static List<Integer> maxMin (List<Integer> Arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : Arr) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		List<Integer> result = new ArrayList<>();
		result.add(max);
		result.add(min);
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(maxMin (Arr).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
