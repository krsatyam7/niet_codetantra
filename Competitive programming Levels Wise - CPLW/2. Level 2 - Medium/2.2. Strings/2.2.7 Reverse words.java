package q3615;
public class CTJ3615 {
    public static String reverseWords (String str) {
	    String[] words = str.split("(?<=\\S)(?=\\s)|(?<=\\s)(?=\\S)");
	    StringBuilder result = new StringBuilder();
	    for (String word : words) {
		    if (!word.trim().isEmpty()) {
		    	result.append(new StringBuilder(word).reverse());
		    } else {
		    	result.append(word);
		    }
	    }
	    return result.toString();
    }
  
    public static void main(String[] args) {
	    String str = args[0];
	    System.out.println( reverseWords (str));
    }
}
