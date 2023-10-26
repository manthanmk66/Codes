import java.util.Scanner;
public class Array2d {
	public static void main(String[]args) {

		int arr[][]=new int[2][3];
		Array2dClasses.accept2d(arr);
        Array2dClasses.display2d(arr);
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the case number");
		int a=sc.nextInt();
		
		switch(a)
		{
	    case 1:
		   Array2dClasses.max2d(arr);
		   break;
		case 2:
	       Array2dClasses.min2d(arr);
	       break;
		case 3:
	       Array2dClasses.transpose2d(arr);
	       break;
		case 4:
	      Array2dClasses.countElements(arr);
	      break;
	
		}
	//dynamic array 
//	int a1[][]=new int[2][];
//	Array2dClasses.acceptDynamic2d(a1);
//	Array2dClasses.displayDynamic2d(a1);
//	

	}

	}
