package q23415;
public class CTJ23415 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return (a / gcd(a,b)) * b;
    }
    public static int findLCM(int n1, int n2, int n3) {
        return lcm(lcm(n1, n2), n3);
    }
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        System.out.println(findLCM(n1, n2, n3));
    }
}
