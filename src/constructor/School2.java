package constructor;

public class School2 
{
	String name;
	int id;
	String add;
	long mob;
	public School2()
	{
		
	}
	public static void main(String args[])
	{
		School2 sc=new School2();
		sc.name="SMBA";
		sc.id=100;
		sc.add="PUNE";
		sc.mob=1234567890L;
		
		System.out.println(sc.name);
		System.out.println(sc.id);
		System.out.println(sc.add);
		System.out.println(sc.mob);
		
				
	}
	

}
