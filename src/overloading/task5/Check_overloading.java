package overloading.task5;

public class Check_overloading 
{
	public void mt()
	{
		System.out.println("Method mt");
	}
	public void mt(int x)
	{
		System.out.println("Method mt="+" "+x);
	}
	public int mt(int x,int y)
	{
		return x+y;
		
	}
	public void mt(double x)
	{
		System.out.println("Method mt="+" "+x);
	
	}
	public String mt(String s1)
	{
		return s1;
	}
	public static void main(String args[])
	{
		Check_overloading c=new Check_overloading();
		c.mt();
		c.mt(10);
		System.out.println(c.mt(10,12));
		c.mt(20d);
		System.out.println(c.mt("ABC"));
		
	}
	


}
