package Sup.Task1;

public class Main {
	
	public static void main(String[] args) {
		A a = new A();  //will call constructor A one time
		C c = new C(); //will call A B C constructor
		B b = new B();  //will call A and B constructor
		
	}
}
