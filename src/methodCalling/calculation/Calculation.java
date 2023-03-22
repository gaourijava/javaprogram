package methodCalling.calculation;

public class Calculation
{
	public static void main(String args[])
	{
		Addition a= new Addition();
		a.add();
		
		Subtraction s=new Subtraction();
		s.sub();
		
		Multiplication m=new Multiplication();
		m.mul();
		
		Division d=new Division();
		d.div();
		
		}

}
