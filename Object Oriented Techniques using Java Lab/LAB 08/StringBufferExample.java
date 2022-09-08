package q24215;
public class StringbufferExample {
	public static void main (String args[]) {
		// create instance of StringBuffer
		StringBuffer s = new StringBuffer();
		// find the initial capacity
		System.out.println("Initial capacity is: "+s.capacity());
		//find the capactiy after passing a parameter args[0] using command line argument
		s = new StringBuffer(args[0]);
		System.out.println("Capacity after passing parameter is: "+s.capacity());
		// find the capatity by intializing capatity to 50
		StringBuffer s1 = new StringBuffer(50);
		System.out.println("Creating a StringBuffer object with the given capacity: "+s1.capacity());
	}
}
