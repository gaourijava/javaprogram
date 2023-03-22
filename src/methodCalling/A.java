package methodCalling;

public class A 
{
	public void m1()
	{
		System.out.println("m1 A");
	}
	public void m2()
	{
		System.out.println("m2 A");
	}
	public static void main(String args[])
	{
		System.out.println("Main Start");
		A a=new A();
		a.m1();
		a.m2();
		System.out.println("Main End");
	}

}
