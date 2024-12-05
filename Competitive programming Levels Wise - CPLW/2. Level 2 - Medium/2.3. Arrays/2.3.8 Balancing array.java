package q26;
import java.util.*;
import java.util.stream.*;
public class CTJ26 {
	public static int balancing_array(List<Long> Arr) {
		long totalSum = 0;
		long leftSum = 0;
		for (long num : Arr) {
			totalSum += num;
		}
		for (int i = 0; i < Arr.size(); i++) {
			long rightSum = totalSum - leftSum - Arr.get(i);
			if (leftSum == rightSum) {
				return i;
			}
			leftSum += Arr.get(i);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		List<Long> Arr = Arrays.stream(args[0].split(",")).map(s -> Long.parseLong(s)).collect(Collectors.toList());
		System.out.println(balancing_array(Arr));
	}
}
