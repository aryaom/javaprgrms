package OOPS;
class Parent
{
	int a=20,b=30,c;
	public void sum()
	{
		c=a+b;
	}
}
class Child extends Parent
{
	public void display()
	{
		System.out.println("Sum= "+c);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.sum();
		c.display();

	}

}
