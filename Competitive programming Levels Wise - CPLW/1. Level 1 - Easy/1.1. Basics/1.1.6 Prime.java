package q23503;
public class CTJ23503 {
        public static int prime(int n) {
            int count = 0;
            int currentNumber = 1;
            while (count < n) {
                currentNumber++;
                if (isPrime(currentNumber)) {
                    count++;
                }
            }
            return currentNumber;
        }
        private static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            System.out.println(prime(n));
        }
}
