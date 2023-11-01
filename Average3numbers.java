package OOPS;

import java.util.Scanner;

public class Average3numbers {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    public void average()
    {
    	System.out.println("Enter 3 numbers");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	c=sc.nextInt();
    	System.out.println("Average= "+((a+b+c)/3));
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average3numbers a=new Average3numbers();
		a.average();
		

	}

}
