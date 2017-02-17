
import java.util.Scanner;
import java.util.Random;

public class HigherLower {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("This is a higher lower quiz!");
		System.out.println("What is your name?");
		String name = reader.next();
		
		System.out.println("Hello, " + name + "!");
		
		System.out.print("I'm going to think of a number, you need to guess if it's higher or lower");
		
		
	}
	
}
