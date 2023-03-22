package initialisevariablesusingobject;

public class Test
{
	public static void main(String args[])
	{
		Mobile m=new Mobile();
		m.ram=1;
		m.name="LG";
		m.weight=2d;
		m.price=1000.500f;
		
		System.out.println(m.ram);
		System.out.println(m.name);
		System.out.println(m.weight);
		System.out.println(m.price);
	}

}
