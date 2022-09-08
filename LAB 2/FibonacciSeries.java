package q10896;
class FibonacciSeries
{
	public static void main(String args[])
	{
		int n,a=0,b=1,s=a+b;
		n=Integer.parseInt(args[0]);
		System.out.print(a);
		while(s<=n)
		{
			System.out.print(" "+s);
			s=a+b;
			a=b;
			b=s;
		}
	}
}
