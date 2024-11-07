package q195;
public class CTJ195 {
    public static int MaxPowerPrime(int N, int P) {
        int count = 0;
        int power = P;
        while (power <= N) {
            count += N / power;
            power *= P;
        }
        return count;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int P = Integer.parseInt(args[1]);
        System.out.println(MaxPowerPrime(N, P));
    }
}
