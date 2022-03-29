package multilevelinjava;

public class multilevelinheritance {                 // multilevel inheritance 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         D d =new D();            //can access the methods of parent classes by creating the child class object
         d.dis();
		 d.print();
		 d.show();
		 d.main();
		System.out.println("a="+d.a+" b="+d.b+" c="+d.c+" d="+d.d);
	}

}
class A{                                // A is the parent class of B
	int a= 10;                            //B is the child class of A
	void dis() {
		System.out.println("a="+a);
	}
}
     
class B extends A{                            // B  is the parent class of C
	int b=20;
	void print() {
		System.out.println("b="+b);
		
	}
	
}

class C extends B{                            // C is the parent class of D
	int c= 30;
	void show() {
		System.out.println("c="+c);
	}
}
class D extends C{
	int d=40;
	void main() {
		System.out.println("d="+d);
	}
}













