package q1632;
public class CTJ1632 {
	public static String rotationOfStrings (String str1, String str2) {
		if (str1.length() != str2.length()) {
			return str2 + "no";
		}
		String doubleStr1 = str1 + str1;
		if (doubleStr1.contains(str2)) {
			return str2 + "yes";
		}
		return str2 + "no";
	}
	
	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		System.out.println( rotationOfStrings (str1, str2));
	}
}
