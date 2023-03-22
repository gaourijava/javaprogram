package constructor;

public class Employee2
{
	int id;
	int sal;
	String name;
	String add;
	public Employee2()
	{
		
	}
	public static void main(String args[])
	{
		Employee2 e=new Employee2();
		e.id=100;
		e.sal=10000;
		e.name="ABC";
		e.add="PUNE";
		
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.add);
		System.out.println(e.sal);
	}

}
