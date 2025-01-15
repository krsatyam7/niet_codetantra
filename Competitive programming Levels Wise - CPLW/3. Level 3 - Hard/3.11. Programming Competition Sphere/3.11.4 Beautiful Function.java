package q18192;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CTJ18192 {
	public static int beautifulFunction(int x) {
		x += 1;
		while (x % 10 == 0) {
			x /= 10;
		}
		return x;
	}
	public static int countReachableNumbers(int N) {
		Set<Integer> reachable = new HashSet<>();
		while (N > 0 && !reachable.contains(N)) {
			reachable.add(N);
			N = beautifulFunction(N);
		}
		return reachable.size();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int result = countReachableNumbers(N);
		System.out.println(result);
	}
}
