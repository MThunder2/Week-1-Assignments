import java.util.*;

public class WK2Prob5 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String randomWord = in.next();
	        
	     if (randomWord.length() >= 10)
	    	 System.out.println("That is a really long word!");
	     else {
	    	 System.out.println("Your word is not that long.");
	     }
	}

}
