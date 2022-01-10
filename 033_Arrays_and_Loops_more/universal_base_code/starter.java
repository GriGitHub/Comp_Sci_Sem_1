import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose the number of elements. It should be between 51 and 200: ");
		int elements = sc.nextInt();
		if(elements<51 || elements>200){
			System.out.println("Please restart the program; you chose an incorrect value.");
			return;
		}
		Random rand = new Random();
		int first[] = new int[elements];
		int c = 0;
		int min = 1000;
		int max = 0;
		while(c<first.length){
			int rand1 = rand.nextInt(100)+1;
			first[c] = rand1;
			if(first[c]<min){
				min = first[c];
			}
			if(first[c]>max){
				max = first[c];
			}
			c = c + 1;
		}
		int addition = 0;
		int total = 0;
		while(addition<first.length){
			total = 0 + first[addition];
			addition = addition + 1;
		}
		double avg = total/first.length;
		System.out.println("There are "+elements+" elements.");
		System.out.println("The minimum is "+min+".");
		System.out.println("The maximum is "+max+".");
		System.out.println("The average is "+avg+".");
		


		
	}
}
