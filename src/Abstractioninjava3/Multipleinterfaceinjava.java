package Abstractioninjava3;

public class Multipleinterfaceinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*         C c =new C();
            c.show();
        		   
	}

}
 
 interface A{
	 void show();
	 
 }

interface B{
	 void show();
}

class C implements A, B{
	 
	public void show() {
		System.out.println("this is show method");
	}
	
}
*/ 
		
		C c= new C();
		c.display();
		
		B b =new B ();
		b.display();

	}}

interface A{
	 void display();
}


class B{
	 void display() {
		 System.out.println("B class method");
	 }
}

class C extends B implements A{
	 public void display() {
		System.out.println("this is C class method");
	}
	
	
	
}





