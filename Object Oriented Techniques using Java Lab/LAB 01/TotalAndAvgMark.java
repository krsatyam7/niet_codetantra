package q10817;
public class TotalAndAvgMarks {
	public static void main(String args[]) {
		String name = args[0];
		float marks1 = Float.parseFloat(args[1]);
		float marks2 = Float.parseFloat(args[2]);
		float marks3 = Float.parseFloat(args[3]);
		float total = marks1+marks2+marks3;
		float avg = total/3;
		System.out.println("Name = " +name );
		System.out.println("Marks1 = " +marks1 );
		System.out.println("Marks2 = " +marks2 );
		System.out.println("Marks3 = " +marks3 );
		System.out.println("Total Marks = " +total );
		System.out.println("Average Marks = " +avg );
	}
}
