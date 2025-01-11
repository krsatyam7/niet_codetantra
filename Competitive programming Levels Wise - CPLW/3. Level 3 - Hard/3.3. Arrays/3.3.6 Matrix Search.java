package q1603;
import java.util.*;
import java.util.stream.*;
public class CTJ1603 {
	public static int spiralVisit(List<String> mat, int v) {
		int m = mat.size();
		if (m == 0) return -1;
		int n = mat.get(0).split(" ").length;
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			String[] row = mat.get(i).split(" ");
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}
		int left = 0;
		int right = m * n - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int midValue = matrix[mid / n][mid % n];
			if (midValue == v) {
				return v;
			} else if (midValue < v) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		List<String> mat = Arrays.stream(args[0].split(",")).map(s -> s).collect(Collectors.toList());
		int v = Integer.parseInt(args[1]);
		System.out.println(spiralVisit(mat, v));
	}
}
