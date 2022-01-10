import java.util.Scanner;
import java.util.Random;

class starter {
	public static double div(double a, double b)
	{
		double x = a;
		double y = b;
		double z = a*b;
		double c = z%3;
		boolean first = a==0;
		if(!first){
			return z;
		}
		System.out.print(z);
		return z;
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double first = sc.nextDouble();
		System.out.print("Please enter another number: ");
		double second = sc.nextDouble();
		double third = div(first,second);
		
		
	



		
	}
}
