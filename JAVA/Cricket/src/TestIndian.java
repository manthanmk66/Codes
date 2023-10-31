import java.util.Scanner;
	
public class TestIndian {
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int choice;
		do{
			System.out.println("1.Add Indian team\n 2.Search Team by Captain\n 3.Search by Player name\n 4.display Indian team");
			System.out.println("Enter the choice\n");
			choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Add an INDIAN TEAM\n");
			IndianServices.addIndianTeam();
			break;
		case 2:
			System.out.println("SEARCH TEAM BY CAPTAIN\n");
			break;
		case 3:
			System.out.println("SEARCHING BY PLAYER NAME\n");
			System.out.println("enter the player name\n");
			String nm=sc.nextLine();
			IndianServices.searchByPname(nm);
		
			
			break;
		case 4:
			System.out.println("DISPLAY INDIAN TEAM\n");
			IndianServices.displayTeam();
			break;
		case 5:
			System.out.println("THANK YOU FOR VISITING\n");
			break;
		}
		}
		while(choice!=6);
		
		

		}

	}



