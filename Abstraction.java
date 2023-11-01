package OOPS;
abstract class Bike
{
	abstract public void acceleration();
	abstract public void speedLimit();
	public void musicSystem()
	{
		System.out.println("music");
	}
}
class Yamaha extends Bike
{

	@Override
	public void acceleration() {
		System.out.println("Yamaha acceleration");
		
	}

	@Override
	public void speedLimit() {
		System.out.println("Yamaha speed");
		
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
	
      Yamaha y= new Yamaha();
      y.acceleration();
      y.speedLimit();
      y.musicSystem();
	}

}

