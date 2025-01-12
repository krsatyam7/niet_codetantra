package q9786;
import java.util.*;
import java.util.stream.*;
public class CTJ9786 {
	public static long heightOfSawblade(List<Integer> treeHeight, int m) {
		long left = 0;
		long right = Collections.max(treeHeight);
		long bestHeight = 0;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			long totalWood = 0;
			for (int height : treeHeight) {
				if (height > mid) {
					totalWood += height - mid;
				}
			}
			if (totalWood >= m) {
				bestHeight = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return bestHeight;
	}
	public static void main(String[] args) {
		List<Integer> treeHeight = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		int m = Integer.parseInt(args[1]);
		System.out.println(heightOfSawblade(treeHeight, m));
	}
}
