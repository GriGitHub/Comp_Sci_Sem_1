import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static double abs(double a)
	{
		double x = a;
		double y = -x-x;
		boolean first = y == 0;
		double z;
		if(first){
			z = -x;
		}
		else{
			z = x;
		}
		return z;
	}
	public static double max(double a, double b)
	{
		double x = a;
		double y = b;
		boolean first = x > y;
		boolean second = y > x;
		boolean third = x == y;
		double z = 1;
		if(first){
			z = x;
		}
		else if(second){
			z = y;
		}
		return z;
		
	}
	public static double min(double a, double b)
	{
		double x = a;
		double y = b;
		boolean first = x < y;
		boolean second = y < x;
		boolean third = x == y;
		double z = 1;
		if(first){
			z = x;
		}
		else if(second){
			z = y;
		}
		return z;
		
	}
	public static double pow(double a, double b)
	{
		double x = a;
		double y = b;
		double z = 2;
		boolean hello = z == y;
		while(true)
		{
			if(hello){
				break;
			}
			x = x*x;
			z = z + 1;
		}
		return x;
	}
	public static double sqrt(double a)
	{
		double x = a;
		
		double t;
		double squareroot = x / 2;
		t = squareroot;
		squareroot = (x + (x / t))/2;
		boolean okay = (t-squareroot)!=0;
		while(okay){
			return squareroot;
		}
		
	}
	public static double avg(double a, double b)
	{
		double x = a;
		double y = b;
		double z = (x+y)/2;
		return z;
		
	}
	public static double random(double a)
	{
		double x = a;
		Random rand = new Random(x);
		return rand;
	}
	public static void main(String args[]) {
		
		double hi = pow(3,3);
		System.out.print(hi);
		
	


		
	}
}
