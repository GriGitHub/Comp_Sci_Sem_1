import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		String[] first = new String[10];
		first[0] = "Twinkle, twinkle, little star";
		first[1] = "How I wonder what you are";
		first[2] = "Up above the world so high";
		first[3] = "Like a diamond in the sky";
		first[4] = first[0];
		first[5] = first[1];
		first[6] = first[0];
		first[7] = first[1];
		first[8] = first[2];
		first[9] = first[3];
		int c = 0;
		while(true){
			System.out.println(first[c]);
			c = c + 1;
			if(c==10){
				break;
			}
		}


		
	}
}
