package OOPS;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m=new Methodoverloading();
		m.sum(20, 20.0);
		m.sum(20, 20,20);
		m.sum(20.0, 20);

	}
	public void sum(int a,double b)
	{
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void sum(double b,int a)
	{
		System.out.println(a+b);
	}
	

}
