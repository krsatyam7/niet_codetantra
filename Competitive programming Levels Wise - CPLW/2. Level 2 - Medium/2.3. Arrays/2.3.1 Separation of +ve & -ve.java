package q1601;
import java.util.*;
import java.util.stream.*;
public class CTJ1601 {
	public static List<Integer> posNegSeparation (List<Integer> Arr) {
		List<Integer> negatives = new ArrayList<>();
		List<Integer> positives = new ArrayList<>();
		for (int num : Arr) {
			if (num < 0) {
				negatives.add(num);
			} else {
				positives.add(num);
			}
		}
		negatives.addAll(positives);
		return negatives;
	}
	
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(posNegSeparation (Arr).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
