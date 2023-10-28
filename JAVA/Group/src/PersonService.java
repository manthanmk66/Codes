import java.util.*;
public class PersonService {
	
	static Person[]parr;
	static int cnt;
	
	static
	{
	parr=new Person[100];
	parr[0]=Person(12,"Manthan","Reddy");
	parr[1]=Person(13,"Pratik","Hanmante");
	parr[2]=Person(14,"Shailesh","Patil");
	parr[3]=Person(15,"Atharav", "Chothve");
	parr[4]=Person(16,"Sourabh","Lovanshi");
	cnt=4;

	}
	public static void addNewUser() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enetr name");
		String name=sc.next();
		
		System.out.println("Enter Mobile");
		String mobile=sc.nextLine();
		
	
		parr[cnt]=new Person(pid,pname,pmobile);
		cnt++;
		}
	private static Person Person(int i, String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
		
	}
	

	
	
}
