import java.util.Scanner;
public class HelloWorld {
public static void main(String[]args) {
	
	
	int arr[]=new int[3];
	ArrayService.acceptData(arr);
	ArrayService.displayData(arr);
	
	
	// finding sum of elements of array by using for loop
	// ArrayService.findSum(arr);
	
	
	// finding the sum of elements of array using for each loop
     ArrayService.findSum(arr);
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number which you want to search in array");
	int v=sc.nextInt();
	int pos=ArrayService.findPos(arr,v);
	if( pos!=-1)
	  {
		  System.out.println("found at "+pos);
	  }
	  else {
		  System.out.println("not found ");
	  }
	 
	
	

}
}
