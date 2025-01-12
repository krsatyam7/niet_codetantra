package q14882;
import java.util.*;
public class CTJ14882 {
	public static int minCostToBreakWaffle(int m, int n, List<Integer> horizontalCosts, List<Integer> verticalCosts) {
		Collections.sort(horizontalCosts, Collections.reverseOrder());
		Collections.sort(verticalCosts, Collections.reverseOrder());
		int totalCost = 0;
		int horizontalPieces = 1;
		int verticalPieces = 1;
		int i = 0, j = 0;
		while (i < horizontalCosts.size() || j < verticalCosts.size()) {
			if (j >= verticalCosts.size() || (i < horizontalCosts.size() && horizontalCosts.get(i) >= verticalCosts.get(j))) {
				totalCost += horizontalCosts.get(i) * verticalPieces;
				horizontalPieces++;
				i++;
			} else {
				totalCost += verticalCosts.get(j) * horizontalPieces;
				verticalPieces++;
				j++;
			}
		}
		return totalCost;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] dimensions = scanner.nextLine().split(" ");
		int m = Integer.parseInt(dimensions[0]);
		int n = Integer.parseInt(dimensions[1]);
		List<Integer> horizontalCosts = new ArrayList<>();
		for (int i = 0; i < m - 1; i++) {
			horizontalCosts.add(scanner.nextInt());
		}
		List<Integer> verticalCosts = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			verticalCosts.add(scanner.nextInt());
		}
		System.out.println(minCostToBreakWaffle(m, n, horizontalCosts, verticalCosts));
	}
}
