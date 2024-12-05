package q1072;
public class CTJ1072 {
	public static int LongestSubstring (String Str1) {
		int maxLength = 1;
		int currentLength = 1;
		for (int i = 1; i < Str1.length(); i++) {
			char prevChar = Str1.charAt(i - 1);
			char currentChar = Str1.charAt(i);
			if ((currentChar == (prevChar + 1)) || (prevChar == 'z' && currentChar == 'a')) {
				currentLength++;
			} else {
				maxLength = Math.max(maxLength, currentLength);
				currentLength = 1;
			}
		}
		maxLength = Math.max(maxLength, currentLength);
		return maxLength;
	}
	
	public static void main(String[] args) {
		String Str1 = args[0];
		System.out.println(LongestSubstring (Str1));
	}
}
