package constructorandmethodinsingleclass;

public class Student 
{
	String name;
	int rollno;
	public void m1()
	{
		System.out.println("output of method");
		System.out.println("Name=" +name);
		System.out.println("Rollno=" +rollno);
		
	}
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
		System.out.println("output of Constructor");
		System.out.println("Name=" +name);
		System.out.println("Rollno=" +rollno);
	}
	public static void main(String args[])
	{
		Student s=new Student("abc",10);
		s.m1();
		//System.out.println(s.name);
		//System.out.println(s.rollno);
	}

}
