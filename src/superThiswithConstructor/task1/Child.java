package superThiswithConstructor.task1;

public class Child extends Parent
{
	public Child()
	{
		super("Hi");
		System.out.println("Constructor Child");
		//System.out.println("Hi");
	}
	public static void main(String args[])
	{
		Child c=new Child();
	}

}
