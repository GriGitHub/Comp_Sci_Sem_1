import java.util.Scanner;
import java.util.Random;

class starter {
	public static double pow(double a, double b)
	{
		double x = a;
		double y = b;
		double z = Math.pow(x,y);
		System.out.print(z);
		return z;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number that will be raised to a power: ");
		double first = sc.nextDouble();
		System.out.print("Please enter the number that the previous number will be raised to: ");
		double second = sc.nextDouble();
		double third = pow(first,second);
	



		
	}
}
