
public class Pattern {
	
//	1
//	12
//	123
//	1234
	
	
	public static void numIncreasingPyamid() 
	{
		 
		   for(int i=1;i<=5;i++) {
			   for(int j=1;j<i;j++) 
			   {
			   System.out.print(j);
			   }
			   System.out.println();
		   }
			  
			   
			}
	
	
//	*
//	**
//	***
//	****
	
	
	
	public static void numIncreasingPyamidStar() 
	{
		 
		   for(int i=1;i<=5;i++) {
			   for(int j=1;j<i;j++) 
			   {
			   System.out.print("*");
			   }
			   System.out.println();
		   }
			  
			   
			}

	
	
public static void main(String []args) {
	numIncreasingPyamid();
	numIncreasingPyamidStar();
	 
	  
	  
	}
  
}

