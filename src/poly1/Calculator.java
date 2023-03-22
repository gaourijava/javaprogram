package poly1;


public class Calculator {
	
	//overloading by number of parameters
	public void calculate(int num1, int num2)
	{
		System.out.println("With two no of paramerer" + num1+" " + num2);
	}
	public void calculate(int num1, int num2, int num3)
	{
		System.out.println("With three no of paramerer" + num1+" " + num2+" " + num3);
	}
	//overloading by Type of  parameter
	public void calculate(float num1, float num2)
	{
		System.out.println(" Wth 2 float and 2 para" + num1+" " + num2);
	}
	public void calculate(double num1, double num2)
	{
		System.out.println(" Wth 2 type and 2 para" + num1+" " + num2);
	}
	//overloading by order of parameter
	public void calculate(double num1, int num2)
	{
		System.out.println(" Wth 2 different type and 2 para" + num1+" " + num2);
	}
	public void calculate(int num1, double num2)
	{
		System.out.println(" Wth 2 different sequence and para" + num1+" " + num2);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calculate(10, 20);
		c.calculate(10, 20,30);
		c.calculate(10.1f,10.1f);
		c.calculate(20.2d,20.2d);
		c.calculate(10.1d,10);
		c.calculate(10,20.1d);

	}

}
