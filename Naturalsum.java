package OOPS;

import java.util.Scanner;

public class Naturalsum
{
	   int i, n, sum=0;
	  public void natural()
	   {
	   Scanner sc = new Scanner(System.in);  
	   System.out.print("Enter number of terms: ");  
	   n = sc.nextInt();
	   System.out.println("The first n natural numbers are : ");
	}
	  public void sum()
	  {
	  
	 for(i=1;i<=n;i++)
	   {
	     System.out.println(i);
	     sum+=i;
	   }
	System.out.println("Sum of natural numbers= " +sum);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Naturalsum ns=new Naturalsum();
        ns.natural();
        ns.sum();
	}

}
