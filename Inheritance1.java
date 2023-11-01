package OOPS;
class Member
{
	String name;
	int age;
	int phone;
	String address;
	int salar;
	public void printdetails(String name,int age,int phone,String address,int salary)
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(salary);
	}
}
class Employee extends Member
{
   String specialization;
}
class Manager extends Member
{
	String departments;
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee e=new Employee();
e.printdetails("arya", 24, 828150768,"kannur",10000);
System.out.println(e.specialization="java");
Manager m=new Manager();
m.printdetails("arya", 24, 828150769,"kannur",10000);
System.out.println(m.departments="Testing");
	}

}
