package OOPS;

public class Ecceptionpgm {

	public static void main(String[] args) {
		try
		{
		int a=10,b=0;
		double c=a/b;
				System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("arithmetic");
		int[] a=new int[3];
		a[0]=2;
		try
		{
		System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	
		

	}

}
