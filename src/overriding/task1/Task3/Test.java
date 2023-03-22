package overriding.task1.Task3;

public class Test {
	public static void main(String args[])
	{
		Parent p = new Parent();
		Child c = new Child();
		GrandChild gc = new GrandChild();
		p.hotel();
		c.hotel();
		gc.hotel();
	}

}
