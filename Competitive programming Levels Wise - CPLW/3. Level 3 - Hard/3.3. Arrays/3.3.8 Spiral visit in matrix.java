package q1602;
import java.util.*;
import java.util.stream.*;
public class CTJ1602 {
	public static String spiralVisit(List<String> mat) {
		if (mat.isEmpty()) return "";
		int m = mat.size();
		int n = mat.get(0).length();
		StringBuilder result = new StringBuilder();
		int top = 0, bottom = m - 1, left = 0, right = n - 1;
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				result.append(mat.get(top).charAt(i));
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				result.append(mat.get(i).charAt(right));
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.append(mat.get(bottom).charAt(i));
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result.append(mat.get(i).charAt(left));
				}
				left++;
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		List<String> mat = Arrays.stream(args[0].split(",")).map(s -> s).collect(Collectors.toList());
		System.out.println(spiralVisit(mat));
	}
}
