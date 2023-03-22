package overriding.task1.Task2;

public class Test {
	
	public static void main(String args[])
	{
		SBI s = new SBI();
		CBI c = new CBI();
		ICICI ic = new ICICI();
		System.out.println(s.rateOfInterest());
		System.out.println(c.rateOfInterest());
		System.out.println(ic.rateOfInterest());
		
		
	}

}
