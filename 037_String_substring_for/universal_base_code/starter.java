import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		String first = sc.nextLine();
		for(int third=1; third<first.length(); third++){
			System.out.println(first.substring(third-1,third));
		}
		
		
			
			
			
		



		
	}
}
