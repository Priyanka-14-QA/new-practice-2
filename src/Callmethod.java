
public class Callmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] a = {1,2,4,6,20,10,0,19};
		
		System.out.println("max is " +max(a));
		System.out.println("min is " +min(a));
		System.out.println("sum is " +sum(a));
		System.out.println("average is " +average(a));
	}

	   public static int max(int[] a) {
		   int maximum= a[0];
		   
		   for(int i=0;i<a.length;i++) {
			   if (maximum<a[i])
					   maximum=a[i];
		   }
			   return maximum; 
	   }
			   
		 public static int min(int[] a) {
	       int minimum=a[0];
	       for(int i=0;i<a.length;i++) {
	    	   if (minimum>a[i])
	    		   minimum=a[i];
	       }
	    				   
	    		return minimum;	
	    		
	       
		 }
		 public static int sum(int[] a) {
			int total=0;
			 for(int i=0;i<a.length;i++) {
				 total += a[i];}
				return total;
		 }
		 
		 public static int average(int[] a) {
			int total=0;
			for(int i=0;i<a.length;i++) {
				total += a[i];
			}
			return total/a.length;
		                           
		 }
	      




}    
	
	
	
	
	


