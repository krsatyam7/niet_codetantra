package q11287;
abstract class Shape                      //Creating an Abstract class
{
	abstract void numberOfSides();        //Empty Method
}

class Trapezoid extends Shape
{
	void numberOfSides()
	{
		int side = 4;
		System.out.println("Number of sides in a trapezoid are "+side);
	}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		int side = 3;
		System.out.println("Number of sides in a triangle are "+side);
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		int side = 6;
		System.out.println("Number of sides in a hexagon are "+side);
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Shape s;
		s = new Trapezoid();
		// Call the method
		s.numberOfSides();
		s = new Triangle();
		// Call the method
		s.numberOfSides();
		s = new Hexagon();
		// Call the method
		s.numberOfSides();
	}
}
