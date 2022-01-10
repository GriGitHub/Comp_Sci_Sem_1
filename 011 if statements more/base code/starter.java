import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		boolean x = first == second;
		if(x)
		{
			System.out.println("This statement is true.");
		}
		if(x==false)
		{
			System.out.print("This statement is false.");
		}
	}
}
