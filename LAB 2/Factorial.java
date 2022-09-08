package q10886;
class Factorial
{
	public static void main(String args[])
	{
	int n;
	int fact = 1;
	n = Integer.parseInt(args[0]);
	for(int i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	System.out.println("Factorial of "+n+" is "+fact);
	}
}
