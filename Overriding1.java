package OOPS;
class Vehicle
{
	public void drive()
	{
		
	}
}
class Car extends Vehicle
{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Repairing a car");
		super.drive();
	}
	
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.drive();

	}

}
