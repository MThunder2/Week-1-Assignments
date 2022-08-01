import java.util.*;

public class WK2Prob6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numericGrade = in.nextInt();
		
		if (numericGrade >= 90 && numericGrade <= 100) {
			System.out.println("A");
		}else if (numericGrade >= 80 && numericGrade < 90) {
			System.out.println("B");
		}else if (numericGrade >= 70 && numericGrade <80) {
			System.out.println("C");
		}else if (numericGrade >= 60 && numericGrade < 70) {
			System.out.println("D");
		} else {
				System.out.println("F");
			}
}
}
