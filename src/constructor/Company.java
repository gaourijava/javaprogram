package constructor;

public class Company 
{
	String name;
	int id;
	String add;
	
	public Company()
	{
		this.name="XYZ";
		this.id=100;
		this.add="GOA";
	}
	public static void main(String args[])
	{
		Company c=new Company();
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.add);
	}
}
