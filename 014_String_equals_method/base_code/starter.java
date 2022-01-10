import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Do you want to be a Wizard, Warrior. or Rogue?");
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		Random rand = new Random();
		int rand1 = rand.nextInt(2);
		boolean x = rand1 == 0;
		boolean y = rand1 == 1;
		if(x)
		{
			String one = new String("Wizard");
			System.out.println("Your role is: "+one);
			boolean a = first.equals(one);
			if(a)
			{
			System.out.println("Your role matches the one you chose.");
			}
			else{
			System.out.println("Your role does not match the one you chose. You may have also used incorrect spelling or capitalization.");
			}
		}
		else if(y)
		{
			String one = new String("Warrior");
			System.out.println("Your role is: "+one);
			boolean a = first.equals(one);
			if(a)
			{
			System.out.println("Your role matches the one you chose.");
			}
			else{
			System.out.println("Your role does not match the one you chose. You may have also used incorrect spelling or capitalization.");
			}
		}
		else{
			String one = new String("Rogue");
			System.out.println("Your role is: "+one);
			boolean a = first.equals(one);
			if(a)
			{
			System.out.println("Your role matches the one you chose.");
			}
			else{
			System.out.println("Your role does not match the one you chose. You may have also used incorrect spelling or capitalization.");
			}
		}
		
		
		
		
			
			
		
		
		
		
		
			
		
	}
}
