package q1635;
import java.util.*;
import java.util.stream.*;
public class CTJ1635 {
	public static int searchRotatedArray(List<Integer> Arr, int target) {
		int left = 0;
		int right = Arr.size() - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (Arr.get(mid) == target) {
				return mid;
			}
			if (Arr.get(left) <= Arr.get(mid)) {
				if (Arr.get(left) <= target && target < Arr.get(mid)) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (Arr.get(mid) < target && target <= Arr.get(right)) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int target = Integer.parseInt(args[1]);
		System.out.println(searchRotatedArray(Arr, target));
	}
}
