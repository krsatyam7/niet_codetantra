package q1071;
public class CTJ1071 {
	public static String StringRotationCheck(String Str1, String Str2) {
		 if (Str1.length() != Str2.length()) {
		 	return "NO";
		 }
		 String concatenated = Str1 + Str1;
		 if (concatenated.contains(Str2)) {
		 	return "YES";
		 }
		 return "NO";
	}
	
	public static void main(String[] args) {
		String Str1 = args[0];
		String Str2 = args[1];
		System.out.println(StringRotationCheck(Str1, Str2));
	}
}
