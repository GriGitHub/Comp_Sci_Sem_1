import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int c = 0;
		while(true){
			int rand1 = rand.nextInt(100)+1;
			System.out.println(rand1);
			c = c + 1;
			if(c==100){
				break;
			}
			
		}


		
	}
}
