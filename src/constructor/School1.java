package constructor;

public class School1
{
	String name;
	long mob;
	String add;
	
	public School1()
	{
		this.name="SMBA";
		this.mob=1234567890L;
		this.add="KOLHAPUR";
	}
	public static void main(String args[])
	{
		School1 sc=new School1();
		System.out.println(sc.name);
		System.out.println(sc.mob);
		System.out.println(sc.add);
	}

}
