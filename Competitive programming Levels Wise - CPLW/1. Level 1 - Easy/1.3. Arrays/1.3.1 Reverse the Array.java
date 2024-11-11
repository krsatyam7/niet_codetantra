package q1555;
import java.util.*;
import java.util.stream.*;
public class CTJ1555 {
    public static List<Integer> reverseArray(List<Integer> Arr) {
        int len = Arr.size();
        int r = len-1;
        int l = 0;
        while(l<=r){
            int temp = Arr.get(l);
            Arr.set(l,Arr.get(r));
            Arr.set(r,temp);
            l++;
            r--;
        }
        return Arr;
    }
    public static void main(String[] args) {
        List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(reverseArray(Arr).stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}

