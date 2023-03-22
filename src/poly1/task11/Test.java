package poly1.task11;

public class Test 
{
	public void m1(Number n)
	{
		System.out.println("m1_Number");
	}
	public void m1(int x)
	{
		System.out.println("m1_int");
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.m1(0);
		t.m1((Number)0);
	}
		
		
		
	

}
