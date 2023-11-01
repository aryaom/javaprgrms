package OOPS;
class Sum
{
	int a=10,b=20,sum=0;
	void sum()
	{
		sum=a+b;
		System.out.println("Sum= "+sum);
	}
}
class Sub extends Sum
{
	int a=30,b=20,sub=0;
	void sub()
	{
		sub=a-b;
		System.out.println("Sub= "+sub);
		
	}
}
class Calc extends Sub
{
	void display()
	{
	  System.out.println("Calculator");
	}
}
public class Mulilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calc c=new Calc();
    c.display();
    c.sum();
    c.sub();
	}

}
