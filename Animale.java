package OOPS;
interface Basicanimal
{
	public void eat();
	public void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("Monkey jumps");
	}
	public void bite()
	{
		System.out.println("Monkey bites");
	}
}
class Human extends Monkey implements Basicanimal
{
	public void speak()
	{
		System.out.println("Human speaks");
	}


	@Override
	public void eat() {
		System.out.println("Animal eats");
		
	}

	@Override
	public void sleep() {
		System.out.println("Animal sleeps");
		
	}
}
public class Animale {

	public static void main(String[] args) {
		Human h=new Human();
		h.speak();
		h.jump();
		h.bite();
		h.eat();
		h.sleep();

	}

}

