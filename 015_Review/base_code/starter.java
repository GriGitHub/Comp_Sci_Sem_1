import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose your character name: ");
		String first = sc.nextLine();
		System.out.print("Do you want to be a Wizard, Warrior, or Rogue? ");
		String second = sc.nextLine();
		boolean boo1 = second.equals("Wizard");
		boolean boo2 = second.equals("Warrior");
		boolean boo3 = second.equals("Rogue");
		if(boo1 || boo2 || boo3)
		{
			System.out.println("You can choose how many points you invest into your traits: Strength, Dexterity, Intelligence, Constitution, Charisma");
			System.out.println("You have 25 total points.");
			int points = 25;
			System.out.print("Points wanted in Strength: ");
			int third = sc.nextInt();
			points = points - third;
			boolean x = points == 0;
			boolean y = points < 0;
			if(x)
			{
				System.out.println("You are out of points. Your profile is as follows: Name: "+first+" ; Role: "+second+" ; Strength="+third);
				return;
			}
			else if(y)
			{
				System.out.println("You went below the point limit. Please restart the program.");
				return;
			}
			else{
				System.out.println(points+" points left.");
			}
			System.out.print("Points wanted in Dexterity: ");
			int fourth = sc.nextInt();
			points = points - fourth;
			boolean a = points == 0;
			boolean b = points < 0;
			if(a)
			{
				System.out.println("You are out of points. Your profile is as follows: Name: "+first+" ; Role: "+second+" ; Strength="+third+" ; Dexterity="+fourth);
			}
			else if(b)
			{
				System.out.println("You went below the point limit. Please restart the program.");
				return;
			}
			else{
				System.out.println(points+" points left.");
			}
			
			
			
			System.out.print("Points wanted in Intelligence: ");
			int fifth = sc.nextInt();
			points = points - fifth;
			boolean c = points == 0;
			boolean d = points < 0;
			if(c)
			{
				System.out.println("You are out of points. Your profile is as follows: Name: "+first+" ; Role: "+second+" ; Strength="+third+" ; Dexterity="+fourth+" ; Intelligence="+fifth);
			}
			else if(d)
			{
				System.out.println("You went below the point limit. Please restart the program.");
				return;
			}
			else{
				System.out.println(points+" points left.");
			}
			
			System.out.print("Points wanted in Constitution: ");
			int sixth = sc.nextInt();
			points = points - sixth;
			boolean e = points == 0;
			boolean f = points < 0;
			if(e)
			{
				System.out.println("You are out of points. Your profile is as follows: Name: "+first+" ; Role: "+second+" ; Strength="+third+" ; Dexterity="+fourth+" ; Intelligence="+fifth+" ; Constitution="+sixth);
			}
			else if(f)
			{
				System.out.println("You went below the point limit. Please restart the program.");
				return;
			}
			else{
				System.out.println(points+" points left.");
			}
			
			System.out.print("Points wanted in Charisma: ");
			int seventh = sc.nextInt();
			points = points - seventh;
			boolean g = points == 0;
			boolean h = points < 0;
			if(g)
			{
				System.out.println("You are out of points. Your profile is as follows: Name: "+first+" ; Role: "+second+" ; Strength="+third+" ; Dexterity="+fourth+" ; Intelligence="+fifth+" ; Constitution="+sixth+" ; Charisma="+seventh);
			}
			else if(h)
			{
				System.out.println("You went below the point limit. Please restart the program.");
			}
			else{
				System.out.println(points+" points left. Your profile is as follows: Name: "+first+" ; Role: "+second+" ; Strength="+third+" ; Dexterity="+fourth+" ; Intelligence="+fifth+" ; Constitution="+sixth+" ; Charisma="+seventh);
			}
		
		}
		else{
			System.out.println("You may have used incorrect spelling or capitalization. Please restart the program.");
			return;
		}
		
			
		
	}
}
