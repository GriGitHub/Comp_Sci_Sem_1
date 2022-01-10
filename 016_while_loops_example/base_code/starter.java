import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.print("What is your name? ");
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		System.out.print("How many times should your name be output to the screen? ");
		int second = sc.nextInt();
		int a = 1;
		while(true)
		{
			System.out.println(first);
			if(a==second)
			{
				break;
			}
			a = a + 1;
		}
	



		
	}
}
