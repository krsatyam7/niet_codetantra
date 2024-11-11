package q3342;
import java.util.*;
import java.util.stream.*;
public class CTJ3342 {
	public static List<Integer> searchTheElement(List<Integer> Arr, List<Integer> e) {
		List<Integer> result = new ArrayList<>();
		for (int element : e) {
			int index = binarySearch(Arr, element);
			result.add(index);
		}
		return result;
	}
	private static int binarySearch(List<Integer> Arr, int target) {
		int left = 0, right = Arr.size() - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (Arr.get(mid) == target) {
				return mid;
			} else if (Arr.get(mid) < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		List<Integer> e = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(searchTheElement(Arr,
		e).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
