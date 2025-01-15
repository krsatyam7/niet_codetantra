package q13406;
import java.util.*;
public class CTJ13406 {
	public static int maxMiceCaught(char[] catMouse, int D) {
		List<Integer> cats = new ArrayList<>();
		List<Integer> mice = new ArrayList<>();
		for (int i = 0; i < catMouse.length; i++) {
			if (catMouse[i] == 'C') {
				cats.add(i);
			} else {
				mice.add(i);
			}
		}
		boolean[] caught = new boolean[mice.size()];
		int count = 0;
		for (int cat : cats) {
			for (int j = 0; j < mice.size(); j++) {
				if (!caught[j] && Math.abs(cat - mice.get(j)) <= D) {
					caught[j] = true;
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine().trim());
		char[] catMouse = scanner.nextLine().trim().replaceAll(" ", "").toCharArray();
		int D = Integer.parseInt(scanner.nextLine().trim());
		System.out.println(maxMiceCaught(catMouse, D));
	}
}
