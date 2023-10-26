import java.util.Scanner;
public class ArrayService {
	
	public static int acceptData(int []arr) 
	{
		Scanner sc=new Scanner(System.in);
		for( int i=0;i<arr.length;i++) 
		{
			System.out.print("enter numbers");
			arr[i]=sc.nextInt();	
		}
		return 0;
	}
	public static int displayData(int []arr) 
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		return 0;
	}
	public static int findSum(int[]arr)
	{
		int s=0;
	
//		for(int i=0;i<arr.length;i++)
//		{
//			s=s+arr[i];
//			
//		}
//		System.out.println("sum --->"+s);
//		return 0;
		for(int val:arr)
		{
			s=s+val;
		}
		
		System.out.println("Sum:"+s);
		return 0;
	 }
	public static int findPos(int[]arr,int val)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;

	}
	
	}

