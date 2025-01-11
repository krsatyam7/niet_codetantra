package q3293;
import java.util.*;
import java.util.stream.*;
public class CTJ3293 {
	public static int shortSequences(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord)) {
			return 0;
		}
		Set<String> wordSet = new HashSet<>(wordList);
		Queue<String> queue = new LinkedList<>();
		Map<String, Integer> distanceMap = new HashMap<>();
		Map<String, Integer> countMap = new HashMap<>();
		queue.offer(beginWord);
		distanceMap.put(beginWord, 0);
		countMap.put(beginWord, 1);
		while (!queue.isEmpty()) {
			String currentWord = queue.poll();
			int currentDistance = distanceMap.get(currentWord);
			for (int i = 0; i < currentWord.length(); i++) {
				char[] charArray = currentWord.toCharArray();
				for (char c = 'a'; c <= 'z'; c++) {
					charArray[i] = c;
					String nextWord = new String(charArray);
					if (wordSet.contains(nextWord)) {
						if (!distanceMap.containsKey(nextWord)) {
							distanceMap.put(nextWord, currentDistance + 1);
							queue.offer(nextWord);
						}
						if (distanceMap.get(nextWord) == currentDistance + 1) {
							countMap.put(nextWord, countMap.getOrDefault(nextWord, 0) + countMap.get(currentWord));
						}
					}
				}
			}
		}
		return countMap.getOrDefault(endWord, 0);
	}
	public static void main(String[] args) {
		String beginWord = args[0];
		String endWord = args[1];
		List<String> wordList = Arrays.stream(args[2].split(",")).map(s -> s).collect(Collectors.toList());
		System.out.println(shortSequences(beginWord, endWord, wordList));
	}
}
