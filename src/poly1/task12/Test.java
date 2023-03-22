package poly1.task12;

public class Test 
{
	public void m1(A a)
	{
		System.out.println("In A Parameter");
	}
	public void m1(B b)
	{
		System.out.println("In B Parameter");
	}
	public void m1(C c)
	{
		System.out.println("In C Parameter");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1((C)null);
		t.m1((A)null);
		t.m1((B)null);
	}
}
