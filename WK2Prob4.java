import java.util.*;

public class WK2Prob4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double assignment1, assignment2, assignment3, assignment4;
	assignment1 = in.nextDouble();
	assignment2 = in.nextDouble();
	assignment3 = in.nextDouble();
	assignment4 = in.nextDouble();
	
	if (assignment1 + assignment2 > 150.0 && assignment3 > 70.0 || assignment4 > 70.0)
		System.out.println("You passed the class.");
		else {
			System.out.println("You failed the class");
		}
}}
		

			
	
