package q78;
import java.util.*;
import java.util.stream.*;
public class CTJ78 {
	public static List<Integer> BookSort(List<Integer> BookId) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int id : BookId) {
			frequencyMap.put(id, frequencyMap.getOrDefault(id, 0) + 1);
		}
		List<Integer> sortedBookIds = new ArrayList<>(BookId);
		sortedBookIds.sort((a, b) -> {
			int freqComparison = Integer.compare(frequencyMap.get(a), frequencyMap.get(b));
			if (freqComparison != 0) {
				return freqComparison;
			} else {
				return Integer.compare(a, b);
			}
		});
		return sortedBookIds;
	}
	
	public static void main(String[] args) {
		List<Integer> BookId = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println( BookSort(BookId).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
