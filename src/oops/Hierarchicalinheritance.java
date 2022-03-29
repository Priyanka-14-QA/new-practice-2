package oops;

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          F f = new F();  //creating the object of child class 'F'
          f.display();
       //   f.print();  its not possible, print method is in class E and class E is sibbling of class F
	       f.show();
	      E g =new E();
	      g.display();
	      g.print();

	System.out.println("d=" +f.d+" f="+f.f);
	System.out.println("d="+g.d+" e="+g.e);
	}

}
 
class D{                                //'D' is the parent class of class 'E' and class 'F'     
	int d=10;                          
	void display() {
		System.out.println("d=" +d);
		
	}
}

class E extends D{                                //'E' is the child class of class 'D'
	int e=20;
	 int d=10;
	void print() {
		display();                          //can directly access the parent class method and variable in child class
		System.out.println("e=" +e);
		
	}
}

class F extends D{                                  //'F' is the child class of class 'D'
	
	int f=30;
	void show() {
		System.out.println("f=" +f);
		
	}
}



