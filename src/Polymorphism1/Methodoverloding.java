package Polymorphism1;

public class Methodoverloding {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Methodoverloding m =new Methodoverloding();
		 System.out.println(m.add(48,89));
		 System.out.println(m.add(40f, 49));
		 System.out.println(m.add(37f, 78f, 78f));
		 System.out.println(m.add(9, 3, 45));
		 System.out.println(m.add(18, 36, 27, 83));
		 
	}
	 
     int add (int a, int b){           
	   return (a+b);
	   }
	 float add(float a, int b) {
		 return a+b;
	 }
	
	 int add(int a,int b,int c) {
		 return a+b+c;
	 }
	 
	 float add(float a, float b, float c) {
		 return a+b+c;
	 }
	 
	 
	 
	 int add(int a,int b,int c,int d) {
		 return a+b+c+d;
	 }
	

}
