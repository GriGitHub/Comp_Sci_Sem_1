import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static double abs(double a)
	{
		double x = a;
		double c = x-x;
		boolean fourth = c==0;
		double y = x*-1;
		double z = y+x;
		boolean first = z==0;
		if(fourth){
			
			return x;
		}
		else if(first){
			return y;
		}
			
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number that you want the absolute value of: ");
		double second = sc.nextDouble();
		double third = abs(second);
		System.out.println(third);
		
	


		
	}
}
