package q208;
import java.util.*;
public class CTJ208 {
	public static int PrimeDifferenceSix(int Left, int Right) {
		boolean[] isPrime = new boolean[Right + 1];
		for (int i = 2; i <= Right; i++) {
			isPrime[i] = true;
		}
		for (int p = 2; p * p <= Right; p++) {
			if (isPrime[p]) {
				for (int multiple = p * p; multiple <= Right; multiple += p) {
					isPrime[multiple] = false;
				}
			}
		}
		List<Integer> primes = new ArrayList<>();
		for (int i = Left; i <= Right; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		int count = 0;
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i + 1; j < primes.size(); j++) {
				if (primes.get(j) - primes.get(i) == 6) {
					count++;
				} else if (primes.get(j) - primes.get(i) > 6) {
					break; // No need to check further
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int Left = Integer.parseInt(args[0]);
		int Right = Integer.parseInt(args[1]);
		System.out.println(PrimeDifferenceSix(Left, Right));
	}
}
