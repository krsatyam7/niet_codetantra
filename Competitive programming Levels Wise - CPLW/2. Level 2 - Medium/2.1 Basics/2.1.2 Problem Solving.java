package q23516;
public class CTJ23516 {
	public static int sumOfPrimes(int n1, int n2) {
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		boolean[] isPrime = sieveOfEratosthenes(10000);
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			if (isPrime[i]) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static boolean[] sieveOfEratosthenes(int maxNum) {
		boolean[] isPrime = new boolean[maxNum + 1];
		for (int i = 0; i <= maxNum; i++) {
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for (int p = 2; p * p <= maxNum; p++) {
			if (isPrime[p]) {
				for (int multiple = p * p; multiple <= maxNum; multiple += p) {
					isPrime[multiple] = false;
				}
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println(sumOfPrimes(n1, n2));
	}
}
