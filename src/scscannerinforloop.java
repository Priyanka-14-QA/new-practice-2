import java.util.Scanner;

public class scscannerinforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*System.out.println("enter no of rows");
	
	Scanner sc= new Scanner(System.in);
	 int totalrow= sc.nextInt();
	 
	 for(int row=1;row<=totalrow;row++) {
		    for(int sp=1;sp<=row-1;sp++) {
			 System.out.print(" ");
		 
		 } for (int st=1;st<=totalrow-row+1;st++) {
			 System.out.print("*");
		 }
			System.out.println();
	 }	*/
	
	/*	System.out.println("enter no of rows");
		
	Scanner sc=new Scanner (System.in);
	  int totalrow= sc.nextInt();
	   for(int row=1;row<=totalrow;row++) {
		   for(int sp=1;sp<=totalrow-row;sp++) { 
			   System.out.print(" ");
	   }
		   for(int st=1;st<=row;st++) {
			   System.out.print("* ");
		   }
		   System.out.println();
		   
	   } */
	
	
	System.out.println("enter no of rows");
	
	 Scanner sc= new Scanner(System.in);
	  int totalrow= sc.nextInt();
	   
	  for(int row=1;row<=totalrow;row++) {
		  for(int sp=1;sp<=row-1;sp++) {                
			  System.out.print(" ");
		  }
	 for(int st=1;st<=totalrow-row+1;st++) {
		 System.out.print("* ");
	 }
	  System.out.println();
	  
	  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
