package pkg;
import java.util.Scanner;
import java.util.Random;


public class Warrior {
	public String name;
	public boolean dead;

	public Warrior() {
		name = "Warrior";
		dead = false;
	}

	public String getName(){
		return name;
	}
	
	public boolean isDead(){
		return dead;
	}
	

	public void interact(Warrior Napoleon){
		System.out.println(Napoleon.name + ", parfaits may be the most delicious thing on the whole planet!");
		return;
	}



}
