import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a phrase. THe limit is four words: ");
		String[] arr = new String[100];
		String arr[0] = sc.nextLine();
		String arr[1] = arr[0].substring(arr[0].indexOf(" ")+1);
		String arr[2] = arr[1].substring(arr[1].indexOf(" ")+1);
		String arr[3] = arr[2].substring(arr[2].indexOf(" ")+1);
	
		System.out.print(arr[3]+" ");
		System.out.print(arr[2].substring(0,arr[2].indexOf(" ")+1));
		System.out.print(arr[1].substring(0,arr[1].indexOf(" ")+1));
		System.out.print(arr[0].substring(0,arr[0].indexOf(" ")+1));
		
		//use loops
	
		
		
		
	

		
	}
}	
