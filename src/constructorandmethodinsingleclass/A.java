package constructorandmethodinsingleclass;

public class A 
{
	public void m1()
	{
		System.out.println("m1 A");
	}
	int a;
	public A(int a)
	{
		System.out.println(a);
	}
	String b;
	public A(String b)
	{
		System.out.println(b);
	}
	public void m2()
	{
		System.out.println("m2 B");
	}
	public static void main(String args[])
	{
		A a=new A(1);
		a.m1();
		a.m2();
		A a2=new A("Abc");
		
		
	}
	
		
	

}
