package Abstractioninjava1;

public class Abstractclassinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    // A a =new A(); to create the object of abstract class is not possible 
		
		A a;        // declaration 
		a= new B(); // initialization
		
		
		//A a=new B();    //type 1
		a.display();
		a.show();
		a.print();
		
     B b =new B();      //type 2
     b.display();     
     b.show();
     b.print();		
	}

}
abstract class A {
	void display () {
		System.out.println("this is display method");
	}
	abstract void show();
	abstract void print();
}

class B extends A{
	void show() { 
	System.out.println("this is show method");
	
	}
	void print() {
		System.out.println("this is print method");
		
	}}













