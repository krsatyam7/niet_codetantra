package q11284;
interface Car {
	String getName();
	int getMaxSpeed();
	default void applyBrake(){
		System.out.println("Applying brake on "+getName());
	}
	static Car getFastestCar(Car car1, Car car2){
		if(car1.getMaxSpeed()>=car2.getMaxSpeed()){
			return car1;
		}
		else{
			return car2;
		}
	}
	
}
class BMW implements Car {
	String carName;
	int MaxSpeed;
	public BMW(String name,int MaxSpeed){
		this.carName=name;
		this.MaxSpeed=MaxSpeed;
	}
	public String getName(){
		return this.carName;
	}
	public int getMaxSpeed(){
		return this.MaxSpeed;
	}
}
class Audi implements Car {
	String carName;
	int MaxSpeed;
	public Audi(String name,int MaxSpeed){
		this.carName=name;
		this.MaxSpeed=MaxSpeed;
	}
	public String getName(){
		return this.carName;
	}
	public int getMaxSpeed(){
		return this.MaxSpeed;
	}
}
public class MainApp {
	public static void main(String args[]) {
		BMW bmw = new BMW(args[0],Integer.parseInt(args[1]));
		Audi audi = new Audi(args[2],Integer.parseInt(args[3]));
		System.out.println("Fastest car is : "+Car.getFastestCar(bmw,audi).getName());
	}
}
