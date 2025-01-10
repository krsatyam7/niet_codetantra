package q28993;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class CTJ28993 {
	public static boolean sumOfSemiPrimes(int n) {
		boolean[] isPrime = new boolean[101];
		for (int i = 2; i <= 100; i++) {
			isPrime[i] = true;
		}
		for (int p = 2; p * p <= 100; p++) {
			if (isPrime[p]) {
				for (int multiple = p * p; multiple <= 100; multiple += p) {
					isPrime[multiple] = false;
				}
			}
		}
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= 100; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		HashSet<Integer> semiPrimes = new HashSet<>();
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i; j < primes.size(); j++) {
				int semiPrime = primes.get(i) * primes.get(j);
				if (semiPrime > 10000) break;
				semiPrimes.add(semiPrime);
			}
		}
		for (int semiPrime : semiPrimes) {
			if (semiPrimes.contains(n - semiPrime)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(sumOfSemiPrimes(n));
	}
}
