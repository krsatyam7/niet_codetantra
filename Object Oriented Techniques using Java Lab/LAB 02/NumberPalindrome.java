package q10894;

public class NumberPalindrome {
	public void isNumberPalindrome(int number)
	{
		int reminder,reverse=0,temp=number;
		while(number!=0)
		{
			reminder=number%10;
			reverse=reverse*10+reminder;
			number/=10;
		}
		if (reverse==temp){
			System.out.println(temp+" is a palindrome");
		}
		
		else{
			System.out.println(temp+" is not a palindrome");
		}
	}
}
