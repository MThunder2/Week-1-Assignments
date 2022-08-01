import java.util.*;


public class WK2Prob2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int moneyInBank, rentDue, carPayment, food;
		moneyInBank = in.nextInt();
		rentDue = in.nextInt();
		carPayment = in.nextInt();
		food = in.nextInt();
	
		int brokeOrNot = moneyInBank - rentDue + carPayment + food;
		
		if (moneyInBank >= 1000)
			System.out.println("You have enough money this week.");
		else
			System.out.println("You may need to borrow some money.");
		
		
		
		
	}

}
