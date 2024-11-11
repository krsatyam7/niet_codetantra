package q1600;
import java.util.*;
import java.util.stream.*;
public class CTJ1600 {
	public static List<Short> zeroTwoSort(List<Short> Arr) {
		short arr[] = new short[3];
		boolean check = false;
		for(short n: Arr){
			if(n>2 || n<0){
				check = true;
				break;
			}
			arr[n]++;
		}
		if(check){
			List<Short> i = new ArrayList<>();
			short k = -1;
			i.add(k);
			return i;
		}
		List<Short> res = new ArrayList<>();
		for(short i = 0;i<3;i++){
			for(short j = 0;j<arr[i];j++){
				res.add(i);
			}
		}
		return res;
	}
public static void main(String[] args) {
	List<Short> Arr = Arrays.stream(args[0].split(",")).map(s -> Short.parseShort(s)).collect(Collectors.toList());
	System.out.println(zeroTwoSort(Arr).stream().map(String::valueOf).collect(Collectors.joining(",")));
}
}
