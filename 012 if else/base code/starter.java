import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		rand1=rand1+1;
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.print("Please guess a number from 1 to 1000: ");
		boolean x = rand1 == first;
		if(x)
		{
			System.out.print("You guessed correctly.");
		}
		else
		{
			System.out.print("You guessed incorrectly.");
		}
	
		
	}
}
