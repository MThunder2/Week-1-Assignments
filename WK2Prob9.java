import java.util.*;
public class WK2Prob9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num >= 10 && num <= 99) {
			System.out.println(num + " is a 2 digit number");
		}else if(num >= 100 && num <= 999) {
			System.out.println(num + " is a 3 digit number");
		}else if(num >=1000 && num <= 9999) {
			System.out.println(num + " is a 4 digit number");
		}else if(num >=10000 && num <= 99999) {
			System.out.println(num + " is a 5 digit number");
		}else {
			System.out.println("Your number is smaller than 10 or larger than 99999.");
			
		}
		
			
			
			
		}
	}


