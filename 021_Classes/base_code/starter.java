import java.util.Scanner;
import java.util.Random;

class Character{
	String role1 = new String("Wizard");
	String role2 = new String("Warrior");
	String role3 = new String("Rogue");
	int Strength = 10;
	int Dexterity = 2;
	int Intelligence = 5;
	int Constitution = 2;
	int Charisma = 6;
	
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character myChar = new Character();
		System.out.println("Your role is " + myChar.role1+".");
		System.out.println("Your Strength is " + myChar.Strength+".");
		System.out.println("Your Dexterity is "+myChar.Dexterity+".");
		System.out.println("Your Intelligence is "+myChar.Intelligence+".");
		System.out.println("Your Constitution is "+myChar.Constitution+".");
		System.out.println("Your Charisma is "+myChar.Charisma+".");
		
		


		
	}
}
