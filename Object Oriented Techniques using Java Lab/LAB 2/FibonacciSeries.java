package q10894;

public class NumberPalindrome {

        public void isNumberPalindrome(int number) {
                int n = number;
                int result = 0;
                while(n > 0){
                        int r = n % 10;
                        n = n / 10;
                        result = result * 10 + r;
                }
                if(result == number){
                        System.out.println(number + " is a palindrome");
                }else{
                        System.out.println(number + " is not a palindrome");
                }
        }
}
