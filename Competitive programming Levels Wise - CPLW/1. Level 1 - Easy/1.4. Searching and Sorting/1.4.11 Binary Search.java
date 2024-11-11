package q29601;
import java.util.*;
import java.util.stream.*;
public class CTJ29601 {
	public static int binSearch(List<Integer> arr, int ele) {
		int left = 0;
		int right = arr.size() - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr.get(mid) == ele) {
				return mid;
			} else if (arr.get(mid) < ele) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return-1;
	}
	public static void main(String[] args) {
		List<Integer> arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int ele = Integer.parseInt(args[1]);
		System.out.println(binSearch(arr, ele));
	}
}
