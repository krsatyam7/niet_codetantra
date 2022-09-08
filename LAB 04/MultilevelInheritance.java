package q11264;
class Student
{
	static int id;
	static String name;
	public void setData(int i,String n)
	{
		Student.id=i;
		Student.name=n;
	}
	public void displayData()
	{
		System.out.println("Id : "+Student.id);
		System.out.println("Name : "+Student.name);
	}
}
class Marks extends Student
{
	static float javaMarks,cMarks,cppMarks;
	public void setMarks(float m1,float m2,float m3)
	{
		Marks.javaMarks=m1;
		Marks.cMarks=m2;
		Marks.cppMarks=m3;
	}
	public void displayMarks()
	{
		System.out.println("Java marks : "+Marks.javaMarks);
		System.out.println("C marks : "+Marks.cMarks);
		System.out.println("Cpp marks : "+Marks.cppMarks);
	}
}
class Result extends Marks
{
	float total,avg;
	public void compute()
	{
		total = Marks.javaMarks+Marks.cMarks+Marks.cppMarks;
		avg = total/3;
	}
	public void showResult()
	{
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);
	}
}
public class MultilevelInheritanceDemo
{
	public static void main(String args[])
	{
		int id=Integer.parseInt(args[0]);
		String name=args[1];
		float m1=Float.parseFloat(args[2]);
		float m2=Float.parseFloat(args[3]);
		float m3=Float.parseFloat(args[4]);
		Result obj=new Result();
		obj.setData(id,name);
		obj.displayData();
		obj.setMarks(m1,m2,m3);
		obj.displayMarks();
		obj.compute();
		obj.showResult();
	}
}
