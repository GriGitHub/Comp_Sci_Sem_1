import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rand1 = rand.nextInt(1000);
		rand1 = rand1+1;
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.println("Please guess a number from 1 to 1000: ");
		boolean x = rand1 == first;
		boolean y = first < rand1;
		boolean z = first > rand1;
		
		if(x)
		{
			System.out.print("You guessed correctly.");
		}
		else if(y)
		{
			System.out.print("Your number is less than the answer.");
		}
		else{
			System.out.print("Your number is greater than the answer.");
		}
		
	}
}
