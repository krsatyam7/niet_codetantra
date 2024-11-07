package q40;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CTJ40 {
    public static int WordCount(String Str) {
        String regex = "[a-zA-Z]+(?:-[a-zA-Z]+)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String Str = args[0];
        System.out.println(WordCount (Str));
    }
}
