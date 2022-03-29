package Polymorphism2;

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login chase =new Login();
		chase.loginapp();
		System.out.println("--------------");
	    Casetwo city= new Casetwo();
          city.loginapp();
          System.out.println("--------------------");
          Casethree tesla =new Casethree();
         tesla.loginapp();
         System.out.println("-----------------------");
         
         Casefour boa =new Casefour();
        		 boa.loginapp();
	}}

class Login{
	void loginapp() {
		System.out.println("enter user name");    // chase bank
		System.out.println("enter password");
		System.out.println("click submit button");
	}}
	
class Casetwo extends Login{                      // city bank
	void loginapp() {
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("click submit button");
		System.out.println("enter phone no.");
		
	}}

class Casethree extends Login{                       //  tesla
	void loginapp() {
		System.out.println("abc");
		
	}
	
}
class Casefour extends Casetwo{                    //BoA
	 void loginapp() {
		 System.out.println("adress");
		 System.out.println("grade");
	 }
	
}
	
