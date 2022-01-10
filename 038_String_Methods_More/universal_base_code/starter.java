import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		int a = first.length;
		while(true){
			System.out.print(first.substring(a));
			a--;
			if(a==0){
				break;
			}
		}


		
	}
}
