package q14736;
import java.util.*;
public class CTJ14736 {
	public static int firstNonRepeatingCharacter(String str) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (charCount.get(str.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(firstNonRepeatingCharacter(input));
	}
}
