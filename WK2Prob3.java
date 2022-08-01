import java.util.*;
	public class WK2Prob3 {
		static void hottestDay(double sundayTemp, double mondayTemp, double tuesdayTemp) {
		
			
			if (sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
				System.out.println("Sunday"); 
			}else if (mondayTemp > sundayTemp && mondayTemp > tuesdayTemp)
				System.out.println ("Monday");
			else {
				System.out.println("Tuesday");
			}
			
		}
		
			
			
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			double sundayTemp, mondayTemp, tuesdayTemp;
			sundayTemp = in.nextDouble();
			mondayTemp = in.nextDouble();
			tuesdayTemp = in.nextDouble();
			
			
				
				
			}
		}
