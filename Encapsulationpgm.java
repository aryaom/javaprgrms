package OOPS;
class encap
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}

public class Encapsulationpgm {

	public static void main(String[] args) {
		encap e=new encap();
		e.setName("arya");
		System.out.println("name: "+e.getName());
		e.setAge(24);
		System.out.println("age: "+e.getAge());
		
		
	}

}
