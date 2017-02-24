
import java.util.*;

public class HigherLower {

	static Scanner reader = new Scanner(System.in);
	static Random rand = new Random();
	static String quitReason = "";
	static int total = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is a higher lower quiz!");
		System.out.println("What is your name?");
		String name = reader.next();
		
		System.out.println("Hello, " + name + "!");
		while (true) {
			MainLoop();
			
			if (quitReason.equals("Wrong")) {
				System.out.println("Your total is: " + total);
				
				System.out.println("Would you like to play again? (y/n)");
				String again = reader.next();
				if (again.equals("y")) {
					continue;
				}
				else {
					System.out.println("Bye!");
					break;
				}
			}
			if (quitReason.equals("Rekt")) {
				System.out.println("It was the same. You lose!");
				System.out.println("Your total is: " + total);
				
				System.out.println("Would you like to play again? (y/n)");
				String again = reader.next();
				if (again.equals("y")) {
					continue;
				}
				else {
					System.out.println("Bye!");
					break;
				}
			}
			if (quitReason.equals("NaN")) {
				System.out.println("Well you're an idiot, aren't you!?");
				System.out.println("Your total is: " + total);
				
				System.out.println("Would you like to play again? (y/n)");
				String again = reader.next();
				if (again.equals("y")) {
					continue;
				}
				else {
					System.out.println("Bye!");
					break;
				}
			}
		}
		
	}
	
	static void MainLoop() {
		//Reset
		total = 0;
		quitReason = "";
		
		System.out.println("I'm going to think of a number between 1 and 100, you need to guess if it's higher or lower");
		int holdNumber = rand.nextInt(100);
		System.out.println("The number is: " + holdNumber);
		//While the quitReason is empty
		while (quitReason.equals("")) {
			System.out.println("Is the next number higher or lower? (h/l)");
			int newNumber = rand.nextInt(100);
			System.out.println("The number is: " + holdNumber);
			String ans = reader.next();
			if (ans.equals("h")) {
				if (newNumber > holdNumber) {
					System.out.println("Correct!");
					total += 1;
					System.out.println("Your current total is: " + total);
					holdNumber = newNumber;
				}
				else if (newNumber < holdNumber) {
					System.out.println("Wrong");
					System.out.println(newNumber);
					quitReason = "Wrong";
				}
				else {
					System.out.println("REKT");
					quitReason = "Rekt";
				}
			}
			else if (ans.equals("l")) {
				if (newNumber < holdNumber) {
					System.out.println("Correct!");
					total += 1;
					System.out.println("Your current total is: " + total);
					holdNumber = newNumber;
				}
				else if (newNumber > holdNumber) {
					System.out.println("Wrong");
					System.out.println(newNumber);
					quitReason = "Wrong";
				}
				else {
					System.out.println("REKT");
					quitReason = "Rekt";
				}
			}
			else {
				System.out.println("Not a correct answer");
				quitReason = "NaN";
			}
		}
	}
	
}
