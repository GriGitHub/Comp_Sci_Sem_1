import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int first[] = new int[1000];
		int c = 0;
		while(true){
			int rand1 = rand.nextInt(100)+1;
			first[c] = rand1;
			c = c + 1;
			if(c==1000){
				break;
			}
		}
		int a = 0;
		while(true){
			System.out.println(first[a]);
			a = a + 1;
			if(a==1000){
				break;
			}
		}


		
	}
}
