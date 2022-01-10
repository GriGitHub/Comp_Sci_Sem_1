import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word or phrase: ");
		String first = sc.nextLine();
		String second;
		int third = 0;
		int fourth = 1;
		while(true){
			if(fourth == first.length()+1){
				break;
			}
			second = first.substring(third,fourth);
			System.out.println(second);
			third = third + 1;
			fourth = fourth + 1;
			
			
			
		}


		
	}
}
