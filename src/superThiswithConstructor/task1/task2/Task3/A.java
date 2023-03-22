package superThiswithConstructor.task1.task2.Task3;

public class A 
{
	public A()
	{
		this(10.1f);
		System.out.println("No arg constructor A");
	}
	public A(int x)
	{
		this();
		System.out.println("int arg constructor A");
		
	}
	public A(double x)
	{
		System.out.println("double arg constructor A");
	}

}
