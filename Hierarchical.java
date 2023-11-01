package OOPS;
class Calculator
{
	void calc()
	{
		System.out.println("Calcuator");
	}
}
class S1 extends Calculator
{
	void sum()
	{
	System.out.println("Sum");
	}
}
class S2 extends Calculator
{
	void sub()
	{
	System.out.println("Sub");
}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S1 s1=new S1();
S2 s2=new S2();
s1.sum();
s2.sub();
	}

}
