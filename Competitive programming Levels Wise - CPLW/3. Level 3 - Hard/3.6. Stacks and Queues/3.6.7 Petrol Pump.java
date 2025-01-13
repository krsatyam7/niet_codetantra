package q13423;
import java.util.*;
import java.util.stream.*;
public class CTJ13423 {
	public static int findStartingPoint(int[] A, int[] B) {
		int totalPetrol = 0;
		int totalCost = 0;
		int currentPetrol = 0;
		int startIndex = 0;
		for (int i = 0; i < A.length; i++) {
			totalPetrol += A[i];
			totalCost += B[i];
			currentPetrol += A[i] - B[i];
			if (currentPetrol < 0) {
				startIndex = i + 1;
				currentPetrol = 0;
			}
		}
		return totalPetrol >= totalCost ? startIndex : -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = scanner.nextInt();
		}
		System.out.println(findStartingPoint(A, B));
		scanner.close();
	}
}
