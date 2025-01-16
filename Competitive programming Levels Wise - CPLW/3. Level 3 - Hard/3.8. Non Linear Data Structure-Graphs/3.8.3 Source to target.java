package q13424;
import java.util.*;
public class CTJ13424 {
	public static int shortestTransformation(String[] wordList, String sourceWord, String targetWord) {
		Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));
		if (!wordSet.contains(targetWord)) return 0;
		Queue<String> queue = new LinkedList<>();
		queue.add(sourceWord);
		int transformations = 1;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				String currentWord = queue.poll();
				if (currentWord.equals(targetWord)) return transformations;
				for (int j = 0; j < currentWord.length(); j++) {
					for (char c = 'a'; c <= 'z'; c++) {
						if (c != currentWord.charAt(j)) {
							String newWord = currentWord.substring(0, j) + c + currentWord.substring(j + 1);
							if (wordSet.contains(newWord)) {
								queue.add(newWord);
								wordSet.remove(newWord);
							}
						}
					}
				}
			}
			transformations++;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine().trim());
		String[] wordList = scanner.nextLine().trim().split(" ");
		String sourceWord = scanner.nextLine().trim();
		String targetWord = scanner.nextLine().trim();
		System.out.println(shortestTransformation(wordList, sourceWord, targetWord));
	}
}
