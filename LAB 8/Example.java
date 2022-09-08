package q24212;
public class Example
{
	public static void main(String args[])
	{
		String store="",Arg=args[0];
		char ch;
		int l=Arg.length();
		for(int i=0;i<l;i++)
		{
			ch=Arg.charAt(i);
			if(ch>='A'&&ch<='Z')
			store+=ch;
		}
		System.out.println("The result is: "+store);
	}
}
