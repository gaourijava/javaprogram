package constructor;

public class School
{
	String name;
	int id;
	String add;
	
	public School(String name,int id,String add)
	{
		this.name=name;
		this.id=id;
		this.add=add;
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(add);
	}
	
	public static void main(String args[])
	{
		School sc=new School("SMBA",10,"PUNE");
		
	}

}
