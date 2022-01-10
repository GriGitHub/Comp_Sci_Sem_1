package pkg;
import java.util.Scanner;
import java.util.Random;

public class Dog {
	public String name;
	public int age;
	public String breed;
	
	public Dog() {
		name = "No name";
		age = 0;
		breed = "No breed";
	}
	public Dog(int a){
		age = a;
	}
	public Dog(String b){
		name = b;
	}
	public Dog(String c){
		breed = c;
	}
	public int Dogage(int a){
		age = a;
		return age;
	}
	public String Dogname(String b){
		name = b;
		return name;
	}
	public String Dogbreed(String c){
		breed = c;
		return breed;
	}
	
}
	
