package q27;
import java.util.*;
import java.util.stream.*;
public class CTJ27 {
    public static int countDuplicates(List<Integer> Arr) {
        int a[] = new int[1000];
        for(int n:Arr){
            a[n]++;
        }
        int c = 0;
        for(int k:a){
            if(k>=2) c++;
        }
        return c;
    }
public static void main(String[] args) {
    List<Integer> Arr = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
    System.out.println(countDuplicates(Arr));
}
}
