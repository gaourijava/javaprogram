package poly1;

public class ClQ9 {
	//Overloading by number of parameters
	public ClQ9(int a, int b)
	{
		System.out.println(a+" "+b);
	}
	public ClQ9(int a, int b, int c)
	{
		System.out.println(a+" "+b+" "+c);
	}
	//Overloading by types of parameters
	public ClQ9(float a, double b)
	{
		System.out.println(a+" "+b);
	}
	public ClQ9(String a, int b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		new ClQ9(10,10);
		new ClQ9(10,10,30);
		new ClQ9(10.2f,10d);
		new ClQ9("Ashish",10);
	
	}
	
	

}
