import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] first = new int[20];
		int c = 0;
		int rand1 = 0;
		while(true){
			rand1 = rand.nextInt(10)+1;
			first[c] = rand1;
			c = c + 1;
			if(c == first.length){
				break;
			}
		}
		System.out.println("An array of 20 random numbers between 1 and 10 has been generated.");
		int rand2 = rand.nextInt(10)+1;
		System.out.println("A random number between 1 and 10 has been generated. "+rand2+" is the target number.");
		int a = 0;
		int duplicates = 0;
		int[] count3 = new int[10];
		while(true){
			if(first[a] == rand2){
				duplicates++;
				if(duplicates == 1){
					count3[0] = a;
				}
				else if(duplicates == 2){
					count3[1] = a;
				}
				else if(duplicates == 3){
					count3[2] = a;
				}
				else if(duplicates == 4){
					count3[3] = a;
				}
				else if(duplicates == 5){
					count3[4] = a;
				}
				else if(duplicates == 6){
					count3[5] = a;
				}
			}
			a++;
			if(a == first.length){
				break;
			}
		}
		int count = 0;
		if((first[19] == rand2) && (first[18] == rand2)){
			duplicates++;
			count = 20;
		}
				
		int b = 0;
		while(true){
			System.out.print(first[b]+" ");
			b++;
			if(b == first.length-1){
				break;
			}
		}
		System.out.println(first[9]);
		if(duplicates == 1){
			System.out.print("There is 1 instance of the target number appearing in the array.");
		}
		else if(duplicates == 0){
			System.out.print("There are no duplicates of the target number in the array.");
		}
		else{
			System.out.print("There are "+duplicates+" duplicates of the target number in the array.");
		}
		if(duplicates == 1){
			System.out.print(" It occurs at this space in the array: "+count3[0]+". ");
		}
		else if(duplicates == 2){
			System.out.print(" It occurs at these spaces in the array: "+count3[0]+", "+count3[1]+". ");
		}
		else if(duplicates == 3){
			System.out.print(" It occurs at these spaces in the array: "+count3[0]+", "+count3[1]+", "+count3[2]+". ");
		}
		else if(duplicates == 4){
			System.out.print(" It occurs at these spaces in the array: "+count3[0]+", "+count3[1]+", "+count3[2]+", "+count3[3]+". ");
		}
		else if(duplicates == 5){
			System.out.print(" It occurs at these spaces in the array: "+count3[0]+", "+count3[1]+", "+count3[2]+", "+count3[3]+", "+count3[4]+". ");
		}
		else if(duplicates == 6){
			System.out.print(" It occurs at these spaces in the array: "+count3[0]+", "+count3[1]+", "+count3[2]+", "+count3[3]+", "+count3[4]+". "+count3[5]+", ");
		}
		else if(duplicates == 7){
			System.out.print(" It occurs at these spaces in the array: "+count3[0]+", "+count3[1]+", "+count3[2]+", "+count3[3]+", "+count3[4]+". "+count3[5]+", "+count3[6]+", ");
		}
		
		
		int f = 0;
		int g = 1;
		int consecutive = 0;
		int triple = 0;
		String[] placement = new String[10];
		while(true){
			if((first[f] == first[g]) && (first[g+1] == first[g])){
				placement[0] = f+" through "+(g+1);
				triple++;
			}
			else if(first[f] == first[g]){
				consecutive++;
				if(consecutive == 1){
					placement[1] = f+" and "+g;
				}
				else if(consecutive == 2){
					placement[2] = f+" and "+g;
				}
				else if(consecutive == 3){
					placement[3] = f+" and "+g;
				}
				
			}
			f++;
			g++;
			if(g == first.length){
				break;
			}
		}
		if(consecutive == 0){
			System.out.println("There are no consecutive numbers.");
		}
		else if(consecutive == 1){
			System.out.println("There are consecutive numbers at "+placement[1]);
		}
		else if(consecutive == 2){
			System.out.println("There are consecutive numbers at "+placement[1]+" as well as at "+placement[2]);
		}
		else if(consecutive == 3){
			System.out.println("There are consecutive numbers at "+placement[1]+", "+placement[2]+", and at "+placement[3]);
		}
		
		if(triple == 1){
			System.out.println("There are also three numbers in a row at "+placement[0]);
		}
		


		
	}
}
