package q23512;
public class CTJ23512 {
        public static int productOfFactors(int n) {
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        product *= i;
                    }
                }
                return product;
        }

        
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(productOfFactors(n));
    }
}
