package OOPS;

public class Constructor {

		// TODO Auto-generated method stub
		int empid;
		String empname;
		String empdesig;
		public Constructor(int empid,String empname,String empdesig)
		{
			this.empid=empid;
			this.empname=empname;
			this.empdesig=empdesig;
		}
		public void display()
		{
			System.out.println("empid= "+empid);
			System.out.println("empname= "+empname);
			System.out.println("empdesignation= "+empdesig);
		}
		public static void main(String[] args) 
		{
			
         Constructor e1=new Constructor(100,"arya","tester");
         Constructor e2=new Constructor(101,"amal","developer");
         e1.display();
         e2.display();
	}

}
