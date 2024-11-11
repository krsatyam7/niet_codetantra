package q1557;
public class CTJ1557 {
	public static String palindrome(String str) {
		int len = str.length();
		int l = 0;
		int r = len-1;
		while(l<r){
			if(str.charAt(l)!= str.charAt(r)) return "Not a palindrome";
			l++;
			r--;
		}
		return "Palindrome";
}
public static void main(String[] args) {
	String str = args[0];
	System.out.println(palindrome(str));
}
}
