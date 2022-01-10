import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand1 = rand.nextInt(10);
		System.out.println(rand1);
		int rand2 = rand.nextInt(100);
		System.out.println(rand2+1);
		double rand3 = rand.nextDouble();
		System.out.println(rand3+2.5);
		double rand4 = rand.nextDouble();
		System.out.println(rand4+14);
		int rand5 = rand.nextInt(35);
		rand5 = rand5+40;
		System.out.print(rand5);
		
	}
}
