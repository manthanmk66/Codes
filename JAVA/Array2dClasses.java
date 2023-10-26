//write a menu driven program for the following
		/*
		 * 1. add two array
		 * 2. find transpose
		 * 3. find minimum number from 2D array
		 * 4. find maximum number from 2D array
		 * 5. display array
		 * 6. check a particular number appears how many times in 2D array
		 * 7. exit
		 *  System.exit(0);
		 * 
		 * */


import java.util.Scanner;

public class Array2dClasses {
	
	
	public static void accept2d(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println("enetr the value "+i+"---"+j);
				  arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void display2d(int arr[][])
	{
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  
			  System.out.print(arr[i][j]+"\t");
		  }
		  System.out.println();
	  }
	}
 public static void max2d(int [][]arr)
	{
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max){ 
					max=arr[i][j];
				}
			}
					
			}
		   System.out.println("maximum element  "+max);
		}
 public static void min2d(int [][]arr)
	{
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min){ 
					min=arr[i][j];
				}
		}
	    }
		   System.out.println("minimum element  "+min);
	}
 public static void transpose2d(int[][]arr)
 {
	// int i,j;
	 int result[][]=new int [arr[0].length][arr.length];
	 for(int i=0;i<arr[0].length;i++) {
		 for(int j=0;j<arr.length;j++) {
			 result[i][j]=arr[j][i];
			 System.out.print(result[i][j]+"\t");
		 }
		 System.out.println();
	 }
	
 }
 public static void countElements(int[][]arr)
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number which you want to count in the array");
 int number=sc.nextInt();
 int cnt=0;
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=0;j<arr[0].length;j++)
	 {
		 if(arr[i][j]==number)
		 {
			 cnt++;
		 }
	 }
	 //System.out.println(cnt);
 }
 System.out.println(cnt);
 }
 
}
	



	
	
	/*
	public static void acceptDynamic2d(int a1[][])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a1.length;i++) 
		{
		 System.out.println("Enter the numbers");
		 int c=sc.nextInt();
		 a1[i]=new int[c];
		 for(int j=0;j<c;j++) {
			 System.out.println("Enter the number");
			 a1[i][j]=sc.nextInt();
		 }
		}
	}
	public static void displayDynamic2d(int arr[][])
	{
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  
			  System.out.print(arr[i][j]+"\t");
		  }
		  System.out.println();
	  }
	}

}
*/
