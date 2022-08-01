
import java.util.*;


public class WK2Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int personOneAge,personTwoAge, personThreeAge;
		personOneAge = in.nextInt();
		personTwoAge = in.nextInt();
		personThreeAge = in.nextInt();
		
		if(personOneAge >= 40) 
		    System.out.println("Person one is older.");
		
		else if(personTwoAge >= 30) 
		    System.out.println("Person two is older."); 

		else {
			System.out.println("Person three is older.");
			
		}
	}}
