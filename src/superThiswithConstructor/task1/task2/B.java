package superThiswithConstructor.task1.task2;

public class B extends A
{
	public B()
	{
		this("hi");
		System.out.println("no arg Constructor B");
		
	}
	public B(String x)
	{
		super();
		System.out.println("arg Constructor B");
	}
	public static void main(String args[])
	{
		B b=new B();
		B b1=new B("Cjc");
	}
	

}
