package q1075;
import java.util.Arrays;
public class CTJ1075 {
	public static String AnagramCheck (String Str1, String Str2) {
		char a[] = Str1.toCharArray();
		char b[] = Str2.toCharArray();
		int l = a.length;
		int r = b.length;
		if(l!=r) return "Not Anagram";
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)){
			return "Anagram";
		}
		else return "Not Anagram";
}
public static void main(String[] args) {
	String Str1 = args[0];
	String Str2 = args[1];
	System.out.println(AnagramCheck (Str1, Str2));
}
}
