package OOPS;

import java.util.Scanner;

interface Bank
{
	public void accountdetails();
	public void balance();
	public void deposit();
	public void withdrawal();
}
class Sbi implements Bank
{  
	Scanner sc=new Scanner(System.in);
	static String bname="SBI";
	double balance=10000.0f;

	@Override
	public void accountdetails() {
		System.out.println("Enter account no");
	    long ac=sc.nextInt();
	    System.out.println("Account details");
	    System.out.println("Name: ARYA");
	    System.out.println("Account no:"+ac); 
		System.out.println("Bank Name: "+bname);
		
	}

	@Override
	public void balance() {
		
		System.out.println("Balance= "+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter deposit amount");
		double deposit=sc.nextDouble();
		System.out.println("Deposited amount= "+deposit);
		balance=balance+deposit;
		System.out.println("Balance= "+balance);	
	}

	@Override
	public void withdrawal() {
		System.out.println("Enter amount to withdraw");
		double withdraw=sc.nextDouble();
		System.out.println("Withdrawal amount= "+withdraw);
		balance=balance-withdraw;
		System.out.println("Balance= "+balance);	
	}
	
}
public class Bankinterface {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.accountdetails();
		s.balance();
		s.deposit();
		s.withdrawal();

	}

}
