package Abstractioninjava2;

public class Interfaceinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a;
		a=new B();
		a.display();
		a.print();
		
		C c =new C();
		c.add();
		c.pay();
		c.display();
	}

}
interface A{
	   final int a= 20;        //Variable will be final  by default   
	 public abstract void display();
	  void print();   // by default method is in public abstract
}

class B implements A {
	public void display() {
		System.out.println("display");
		
	}
	public void print() {
		System.out.println("print");
		
	}
}

class C extends B implements A{
	public void display() {
		System.out.println("display of c");
		
	}
	void add() {
		System.out.println("add");
	}
	void pay() {
		System.out.println("pay");
	}
}










