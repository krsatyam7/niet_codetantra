package q9777;
public class CTJ9777 {
	public static int convertStringToPalindrome (String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		String combined = str + "#" + reversed;
		int[] lps = new int[combined.length()];
		for (int i = 1; i < combined.length(); i++) {
			int j = lps[i - 1];
			while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
				j = lps[j - 1];
			}
			if (combined.charAt(i) == combined.charAt(j)) {
				j++;
			}
			lps[i] = j;
		}
		int longestPalindromicSuffixLength = lps[lps.length - 1];
		return str.length() - longestPalindromicSuffixLength;
	}
	public static void main(String[] args) {
		String str = args[0];
		System.out.println(convertStringToPalindrome (str));
	}
}
