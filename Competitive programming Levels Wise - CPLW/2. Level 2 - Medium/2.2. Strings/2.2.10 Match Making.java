package q14430;
import java.util.*;
public class CTJ14430 {
	private static void computeLPSArray(String pattern, int[] lps) {
		int length = 0;
		lps[0] = 0;
		int i = 1;
		while (i < pattern.length()) {
			if (pattern.charAt(i) == pattern.charAt(length)) {
				length++;
				lps[i] = length;
				i++;
			} else {
				if (length != 0) {
					length = lps[length - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}
	
	private static void KMPSearch(String text, String pattern) {
		int textLength = text.length();
		int patternLength = pattern.length();
		int[] lps = new int[patternLength];
		computeLPSArray(pattern, lps);
		int i = 0;
		int j = 0;
		boolean found = false;
		while (i < textLength) {
			if (pattern.charAt(j) == text.charAt(i)) {
				i++;
				j++;
			}
			if (j == patternLength) {
				System.out.print((i - j) + " ");
				j = lps[j - 1];
				found = true;
			} else if (i < textLength && pattern.charAt(j) != text.charAt(i)) {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}
		if (!found) {
			System.out.print("-1");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().trim();
		String pattern = scanner.nextLine().trim();
		KMPSearch(text, pattern);
		scanner.close();
	}
}
