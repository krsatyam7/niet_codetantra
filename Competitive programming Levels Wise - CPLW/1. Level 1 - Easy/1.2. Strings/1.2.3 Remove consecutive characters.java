package q3340;
public class CTJ3340 {
    public static String removeConsecutiveCharacters(String str) {
        char a[] = str.toCharArray();
        int l = a.length;
        String res = "";
        res+=a[0];
        for(int i = 1;i<l;i++){
            if(a[i]!=a[i-1]){
                res+=a[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = args[0];
        System.out.println(removeConsecutiveCharacters(str));
    }
}
