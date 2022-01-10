import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		rand1 = rand1+1;
		System.out.print("Please guess a number between 1 and 1000: ");
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			int first = sc.nextInt();
			boolean x = first == rand1;
			boolean y = first < 1;
			boolean z = first >1000;
			if(x)
			{
				System.out.print("You guessed the correct number.");
				break;
			}
			else if(y)
			{
				System.out.print("Your number is too low. Try again: ");
			}
			else if(z)
			{
				System.out.print("Your number is too high. Try again: ");
			}
			else{
				System.out.print("Try again: ");
			}
			
			
		}



		
	}
}
