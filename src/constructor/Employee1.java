package constructor;

public class Employee1 
{
	int id;
	double Sal;
	String name;
	public Employee1()
	{
		this.id=10;
		this.Sal=10000d;
		this.name="ABCD";
	}
	public static void main(String args[])
	{
		Employee1 e=new Employee1();
		System.out.println(e.id);
		System.out.println(e.Sal);
		System.out.println(e.name);
		
	}
		
	

}
