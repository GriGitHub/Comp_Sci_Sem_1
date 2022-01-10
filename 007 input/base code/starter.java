import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String first = sc.nextLine();
		System.out.println("What is your age?");
		int second = sc.nextInt();
		System.out.println("What is your birthday month?");
		int third = sc.nextInt();
		System.out.println("What is your birthday day?");
		int fourth = sc.nextInt();
		System.out.println("What is your birthday year?");
		int fifth = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double sixth = sc.nextDouble();
		
	}
}
