import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static double abs(double a)
	{
		double x = a;
		double y = -x+x;
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
		boolean first = z < y;
		while(first){
			x = x*x;
			z = z + 1;
		}
		return x;
		
	
	}
	public static double fac(double a)
	{
		double x = a;
		double c = x;
		c = c-1;
		while(true){
			x = x*c;
			c = c-1;
			if(c==0){
				break;
			}
		}
		return x;
	}
	
	public static void main(String args[]) {
		
		double first = fac(5);
		System.out.println(first);
		
		
		
		
	


		
	}
}
		
		
		
		
	


		
	

