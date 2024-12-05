package q14887;
import java.util.HashMap;
import java.util.Scanner;
public class CTJ14887 {
	public static int countMaxTriplets(int[] arr, int N, int M) {
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		int tripletCount = 0;
		for (int num = 1; num <= M; num++) {
			if (freqMap.containsKey(num)) {
				int count = freqMap.get(num);
				tripletCount += count / 3;
				freqMap.put(num, count % 3);
			}
		}
		for (int num = 1; num <= M - 2; num++) {
			if (freqMap.containsKey(num) && freqMap.containsKey(num + 1) && freqMap.containsKey(num + 2)) {
				int minCount = Math.min(freqMap.get(num), Math.min(freqMap.get(num + 1), freqMap.get(num + 2)));
				tripletCount += minCount;
				freqMap.put(num, freqMap.get(num) - minCount);
				freqMap.put(num + 1, freqMap.get(num + 1) - minCount);
				freqMap.put(num + 2, freqMap.get(num + 2) - minCount);
			}
		}
		return tripletCount;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		int result = countMaxTriplets(arr, N, M);
		System.out.println(result);
	}
}
