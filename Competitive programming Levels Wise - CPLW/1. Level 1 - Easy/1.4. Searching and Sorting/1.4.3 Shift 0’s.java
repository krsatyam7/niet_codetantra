package q1076;
import java.util.*;
import java.util.stream.*;
public class CTJ1076 {
	public static List<Short> ShiftZeros(List<Integer> A) {
		int zerocount = 0;
		for (int num : A) {
			if (num == 0) {
				zerocount++;
			}
		}
		List<Short> result = new ArrayList<>();
		for (int i = 0; i < zerocount; i++) {
			result.add((short) 0);
		}
		for (int i = zerocount; i < A.size(); i++) {
			result.add((short) 1);
		}
		return result;
	}
	public static void main(String[] args) {
		List<Integer> A = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(ShiftZeros(A).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
