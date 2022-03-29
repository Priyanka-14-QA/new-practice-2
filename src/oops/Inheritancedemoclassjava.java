package oops;


public class Inheritancedemoclassjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B b = new B();
      // System.out.println("c=" +b.c);
       b.print();
       b.display();
	}

}
 
 class A { 
	 int a=20;
	 int b=30;
    void display() {
    	System.out.println("a="+a+" b="+b);
    } 
 }
 
 class B extends A{
	 int c= 40;	
	  void print() {
		  System.out.println("c="+c);
	  }
 }
	
 