package settergetter;

public class Test
{
	public static void main(String args[])
	{
		Mobile m=new Mobile();
		m.setRam(1);
		m.setName("LG");
		m.setWeight(2d);
		m.setPrice(1000f);
		
		System.out.println(m.getRam());
		System.out.println(m.getName());
		System.out.println(m.getWeight());
		System.out.println(m.getPrice());
		
	}

}
