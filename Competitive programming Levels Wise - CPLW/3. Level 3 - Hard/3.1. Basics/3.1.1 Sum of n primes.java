package q23504;
public class CTJ23504 {
	public static int sumOfPrimes(int n) {
		if (n < 1) return 0;
		int count = 0;
		int sum = 0;
		int number = 2;
		while (count < n) {
			if (isPrime(number)) {
				sum += number;
				count++;
			}
			number++;
		}
		return sum;
	}
	private static boolean isPrime(int num) {
		if (num <= 1) return false;
		if (num <= 3) return true;
		if (num % 2 == 0 || num % 3 == 0) return false;
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(sumOfPrimes(n));
	}
}
