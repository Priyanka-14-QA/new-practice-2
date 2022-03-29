
/*public class Constructor {
	  
	 String name;
	 int rollno;
	 String adress;
	  int result; 	
	     Constructor(String studentname,int studentrollno,String studentadress,int studentresult){
	    	 name= studentname;
	    	 rollno= studentrollno;
	    	 adress= studentadress;
	    	 result= studentresult;
	    	 
	    	 System.out.println("name = " +name);
			   System.out.println("rollno = " +rollno);
			   System.out.println("adress = " +adress);
			   System.out.println("result = " +result);
	     }
	  
	   	 
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		 Constructor priyanka = new Constructor("priyanka",25,"USA",02);
	      
	     Constructor mahi= new Constructor("mahi",01,"Plano",01);
	      
	}

} */






public class Constructor {
	  
	 String name;
	 int rollno;
	 String adress;
	  int result; 	
	     Constructor(String studentname,int studentrollno,String studentadress,int studentresult){
	    	 name= studentname;
	    	 rollno= studentrollno;
	    	 adress= studentadress;
	    	 result= studentresult;
	     }	 
	    	 
	   void studentinfo() { 
	     System.out.println("name = " +name);
			   System.out.println("rollno = " +rollno);
			   System.out.println("adress = " +adress);
			   System.out.println("result = " +result);
	   }
	  
	   	 
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		 Constructor priyanka = new Constructor("priyanka",25,"kolkata",02);
	      priyanka.studentinfo();
	      
	     Constructor mahi = new Constructor("mahi",01,"USA",01);
	      mahi.studentinfo();
	}

}

