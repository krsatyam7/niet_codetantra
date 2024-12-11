package q1721;
import java.util.*;
import java.util.stream.*;
public class CTJ1721 {
	public static int minimumNumberOfPlatforms(int n, List<Integer> arrival, List<Integer> departure) {
		int[] arr = new int[n];
		int[] dep = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = arrival.get(i);
			dep[i] = departure.get(i);
		}
		Arrays.sort(arr);
		Arrays.sort(dep);
		int platformNeeded = 1;
		int result = 1;
		int i = 1;
		int j = 0;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				platformNeeded++;
				i++;
			} else {
				platformNeeded--;
				j++;
			}
			result = Math.max(result, platformNeeded);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		List<Integer> arrival = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		List<Integer> departure = Arrays.stream(args[2].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println( minimumNumberOfPlatforms(n, arrival, departure));
	}
}
