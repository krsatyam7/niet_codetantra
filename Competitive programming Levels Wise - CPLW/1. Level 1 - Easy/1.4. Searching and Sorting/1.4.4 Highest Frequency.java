package q3666;
import java.util.LinkedHashMap;
import java.util.Map;
public class CTJ3666 {
	public static String highestFrequency (String str) {
		Map<Character, Integer> freq = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}
		int maxFreq = 0;
		for (int count : freq.values()) {
			maxFreq = Math.max(maxFreq, count);
		}
		StringBuilder result = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
			if (entry.getValue() == maxFreq) {
				result.append(entry.getKey());
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String str = args[0];
		System.out.println( highestFrequency (str));
	}
}
