package overloading.task1;

public class Calculator 
{
	public void add(int num1,int num2)
	{
		System.out.println(num1+" "+num2);
		
		
	}
	public void add(int num1,int num2,int num3)
	{
		System.out.println(num1+" "+num2+" "+num3);
	}
	public void add(float num1,float num2) 
	{
		System.out.println(num1+" "+num2);
		
	}
	public void add(double num1,double num2)
	{
		System.out.println(num1+" "+num2);
	}
	public void add(double num1,int num2)
	{
		System.out.println(num1+" "+num2);
	}
	public void add(int num1,double num2)
	{
		System.out.println(num1+" "+num2);
	}
	public static void main(String args[])
	{
		Calculator c=new Calculator();
	    c.add(1,2);
	    c.add(1,2,3 );
	    c.add(1.2f,2.2f);
	    c.add(5d,5d);
	    c.add(4d,1);
	    c.add(1, 2d);
	    
	    
	}
	
	

}
