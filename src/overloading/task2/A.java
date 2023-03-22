package overloading.task2;

public class A 
{
	public void display()
	{
		System.out.println("display method");
	}
	public int display(int x)
	{
		return x;
		
	}
	public void display(String message)
	{
		System.out.println(message);
	}
	public int display(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		A a=new A();
		a.display();
		
		System.out.println(a.display(10));
		a.display("ABC");
		System.out.println(a.display(10,5));
	}
	


}
