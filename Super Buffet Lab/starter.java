import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input two integers. First integer: ");
		int first = sc.nextInt();
		System.out.print("Second integer: ");
		int second = sc.nextInt();
		int firstint = first%2;
		boolean x = firstint == 0;
		if(x){
			System.out.println("The first number is even.");
		}
		else{
			System.out.println("This first number is odd.");
		}
		int secondint = second%2;
		boolean e = secondint == 0;
		if(e){
			System.out.println("The second number is even.");
		}
		else{
			System.out.println("The second number is odd.");
		}
		
		double third = first;
		double thirdint = first/3;
		double fourthint = first/4;
		double fifthint = first/5;
		double sixthint = third/3;
		double seventhint = third/4;
		double eighthint = third/5;
		boolean y = thirdint == sixthint;
		boolean z = fourthint == seventhint;
		boolean a = fifthint == eighthint;
		
		double fourth = second;
		double ninthint = second/3;
		double tenthint = second/4;
		double eleventhint = second/5;
		double twelfthint = fourth/3;
		double thirteenthint = fourth/4;
		double fourteenthint = fourth/5;
		boolean b = ninthint == twelfthint;
		boolean c = tenthint == thirteenthint;
		boolean d = eleventhint == fourteenthint;
	
	
		
		if(y){
			System.out.println("The first number is divisible by 3.");
		}
		else{
			System.out.println("The first number is not divisible by 3.");
		}
		if(z){
			System.out.println("The first number is divisible by 4.");
		}
		else{
			System.out.println("The first number is not dibisible by 4.");
		}
		if(a){
			System.out.println("The first number is divisible by 5.");
		}
		else{
			System.out.println("The first number is not divisible by 5.");
		}
		if(b){
			System.out.println("The second number is divisible by 3.");
		}
		else{
			System.out.println("The second number is not divisible by 3.");
		}
		if(c){
			System.out.println("The second number is divisible by 4.");
		}
		else{
			System.out.println("The second number is not divisible by 4.");
		}
		if(d){
			System.out.println("The second number is divisible by 5.");
		}
		else{
			System.out.println("The second number is not divisible by 5.");
		}
		

		
	}
}
