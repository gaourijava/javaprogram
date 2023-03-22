package overloading.task4;

public class Check 
{
	public void disp(int a,double b)
	{
		System.out.println("Method A="+" "+a+" "+b);
	}
	public void disp(int a,double b,double c)
	{
		System.out.println("Method B="+" "+a+" "+b+" "+c);
	}
	public void disp(int a,int b)
	{
		System.out.println("Method C="+" "+a+" "+b);
	}
	public static void main(String args[])
	{
		Check c=new Check();
		c.disp(10,2.5d);
		c.disp(20,5d,6d);
		c.disp(100,200);
	
				
	}

}
