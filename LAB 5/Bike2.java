//Base class definition
class Vehicle{
	public void display(){
		System.out.println("Vehicle is running");
	}
}
//Derived class inheriting base class
class Bike extends Vehicle{
	@Override public void display(){
		System.out.println("Bike is running safely");
	}
}
//main class
public class Bike2{
	public static void main(String args[]){
		Vehicle vehicle = new Vehicle();
		Vehicle bike = new Bike();
		vehicle.display();
		bike.display();
	}
}
