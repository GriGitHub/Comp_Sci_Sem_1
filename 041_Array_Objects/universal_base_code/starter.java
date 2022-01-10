import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior Napoleon = new Warrior();
		Random rand = new Random();
		int rand1 = rand.nextInt(1000)+500;
		while(true){
			String first = new String()
			String statement = new String(points+" health points remaining.");
			if(Napoleon.isDead()){
				statement = new String(Napoleon.name + " IS DEAD!");
			}
			System.out.println(statement);
			
		}
		
		

		
	}
}
