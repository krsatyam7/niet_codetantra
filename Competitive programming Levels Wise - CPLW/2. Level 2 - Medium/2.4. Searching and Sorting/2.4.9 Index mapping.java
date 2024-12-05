package q1634;
import java.util.*;
import java.util.stream.*;
public class CTJ1634 {
	public static List<Integer> indexmapping(List<Integer> Arr) {
		List<Integer> result = new ArrayList<>();
			for (int i = 0; i < Arr.size(); i++) {
			if (Arr.get(i).equals(i)) {
				result.add(i);
			}
		}
		if (result.isEmpty()) {
			result.add(-1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(indexmapping(Arr).stream().map(String::valueOf).collect(Collectors.joining(",")));
	}
}
