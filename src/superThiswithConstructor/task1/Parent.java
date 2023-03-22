package superThiswithConstructor.task1;

public class Parent
{
	public Parent()
	{
		System.out.println("Constructor Parent");
	}
	public Parent(String s)
	{
		this();
		System.out.println("Parameterised Constructor Parent");
	}

}
