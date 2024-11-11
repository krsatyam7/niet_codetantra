package q1631;
import java.util.*;
public class CTJ1631 {
	public static String uniqueCharacters(String str) {
		List<Character> l = new ArrayList<>();
		char a[] = str.toCharArray();
		for(char n:a){
			if(!l.contains(n)) l.add(n);
		}
		String ans = "";
		for(char nn:l){
			ans +=nn;
		}
		return ans;
	}
public static void main(String[] args) {
	String str = args[0];
	System.out.println(uniqueCharacters(str));
}
}
