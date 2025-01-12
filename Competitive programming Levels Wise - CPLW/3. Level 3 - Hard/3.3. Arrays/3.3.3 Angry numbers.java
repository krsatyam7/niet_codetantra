package q3338;
import java.util.*;
import java.util.stream.*;
public class CTJ3338 {
	public static List<String> sumAngryNumbers(List<Integer> Arr) {
		Set<Integer> angryNumbers = new HashSet<>();
		List<Integer> angryList = new ArrayList<>();
		for (int x = 1; ; x++) {
			int angryNum = (x * (x + 1)) / 2;
			if (angryNum > 1_000_000_000) break;
			angryNumbers.add(angryNum);
			angryList.add(angryNum);
		}
		List<String> results = new ArrayList<>();
		for (int num : Arr) {
			boolean found = false;
			for (int angryNum : angryList) {
				if (angryNum >= num) break;
				if (angryNumbers.contains(num - angryNum)) {
					found = true;
					break;
				}
			}
			results.add(found ? "YES" : "NO");
		}
		return results;
	}
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(sumAngryNumbers(Arr).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
