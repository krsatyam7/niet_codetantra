package q9783;
public class CTJ9783 {
	public static int findTheIndices(int n) {
		return (int) Math.sqrt(n - 1);
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(findTheIndices(n));
	}
}
