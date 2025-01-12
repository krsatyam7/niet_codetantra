package q3289;
import java.util.*;
import java.util.stream.*;
public class CTJ3289 {
	public static int palindromeMakeover(List<Integer> Arr) {
		int left = 0;
		int right = Arr.size() - 1;
		int merges = 0;
		while (left < right) {
			if (Arr.get(left).equals(Arr.get(right))) {
				left++;
				right--;
			} else if (Arr.get(left) < Arr.get(right)) {
				Arr.set(left + 1, Arr.get(left) + Arr.get(left + 1));
				left++;
				merges++;
			} else {
				Arr.set(right - 1, Arr.get(right) + Arr.get(right - 1));
				right--;
				merges++;
			}
		}
		return merges;
	}
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(palindromeMakeover(Arr));
	}
}
