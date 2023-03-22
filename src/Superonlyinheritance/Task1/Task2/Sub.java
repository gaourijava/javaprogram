package Superonlyinheritance.Task1.Task2;

public class Sub extends Parent
{
	public Sub()
	{
		System.out.println("Constructor Sub");
	}
	public Sub(int x)
	{
		System.out.println(" arg-Constructor Sub");
	}
	public void display()
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		Sub s=new Sub();
		s.display();
		Sub s1=new Sub(10);
		s1.display();
		
	}
	

}
