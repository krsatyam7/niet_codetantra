package q10;
public class CTJ10 {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	public static int CarRace(int N1, int N2, int N3) {
		int lcmN1N2 = lcm(N1, N2);
		return lcm(lcmN1N2, N3);
	}
	public static void main(String[] args) {
		int N1 = Integer.parseInt(args[0]);
		int N2 = Integer.parseInt(args[1]);
		int N3 = Integer.parseInt(args[2]);
		System.out.println(CarRace(N1, N2, N3));
	}
}
