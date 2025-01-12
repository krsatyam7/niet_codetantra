package q94;
import java.util.*;
import java.util.stream.*;
public class CTJ94 {
	public static List<String> PalindromicCuts(String Str) {
		int n = Str.length();
		for (int i = 1; i < n - 1; i++) {
			String first = Str.substring(0, i);
			if (!isPalindrome(first)) continue;
			for (int j = i + 1; j < n; j++) {
				String second = Str.substring(i, j);
				String third = Str.substring(j);
				if (isPalindrome(second) && isPalindrome(third)) {
					return Arrays.asList(first, second, third);
				}
			}
		}
		return Collections.singletonList("Impossible");
	}
	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		String Str = args[0];
		System.out.println(PalindromicCuts(Str).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
