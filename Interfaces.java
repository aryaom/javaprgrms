package OOPS;
interface Simplecalculator
{
	public void add();
	public void sub();
}
interface Advancecalculator
{
	public void modulus();
	public void square();
}
class Calcus implements Simplecalculator,Advancecalculator
{

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}

	@Override
	public void modulus() {
		System.out.println("modulus");
		
	}

	@Override
	public void square() {
		System.out.println("square");
		
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		Calcus c=new Calcus();
		c.add();
		c.sub();
        c.modulus();
        c.square();
	}

}
