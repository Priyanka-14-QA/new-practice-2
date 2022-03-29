
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		int a[]= { 10,20,30,40,50,90,200};
//		int a1[]= { 10,20,30,40,50,90,200};
//		int a2[]= { 10,20,30,40,50,90,200};
//		int a3[]= { 10,20,30,40,50,90,200};
//		int a4[]= { 10,20,30,40,50,90,200};
//		
		
		int b[] = new int[7];
		
		b[0]=10;
		b[1]=11;
		b[2]=12;
		b[3]=13;
		b[4]=14;
		b[5]=15;
		
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
		}
		
				
	//	  System.out.println(a[0]);
	//	  System.out.println(a[3]);
		
	//	for(int i=0;i<5;i++) {
	//		System.out.println(a[i]);}
		
		reversDigits(-123);
		
		
		
	}
	
	public static int reversDigits(int num)
	{
	    int rev_num = 0;
	    while (num != 0)
	    {
	        rev_num = rev_num*10 + num%10;
	        num = num/10;
	    }
	    System.out.println(rev_num);
	    return rev_num;
	   
	}
	 
}