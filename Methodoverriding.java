package OOPS;
class Method1
{
	public void phone()
	{
		System.out.println("phone1");
	}
}
class Method2 extends Method1
{
@Override
	public void phone() 
    {
	System.out.println("phone2");
		super.phone();
	}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			Method2 m2=new Method2();
			m2.phone();

		}

}