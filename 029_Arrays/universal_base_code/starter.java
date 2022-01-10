import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] first = new int[10];
		int c = 0;
		int variable = 9;
		while(true){
			first[c] = variable;
			variable = variable - 1;
			c = c + 1;
			if(c==10){
				break;
			}
		}
		int a = 0;
		while(true){
			System.out.print(first[a]);
			a = a + 1;
			if(a==10){
				return;
			}
		}


		
	}
}
