/* 
 * bye is to exit add/subtract/multiply
 * 
 */
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		System.out
				.println("Would you like to Add, Subtract, Multiply or Divide?");
		Scanner user = new Scanner(System.in);
		String command = user.nextLine().toLowerCase();

		boolean loop = true;
		String input;
		double answer = 0.0;
		double x;

		if (command.equals("add")) {
			while (loop == true) {
				System.out.println("What would you like to add?");
				input = user.next();
				if (input.equals("bye")) {
					loop = false; 
					System.out.println("Your answer is " + answer);
				} else {
					x = Double.parseDouble(input);
					answer = Basic.add(answer, x);
					System.out.println("= " + answer);
				}
			}
		}
		if (command.equals("subtract")) {
			System.out.println("What would you like to subtract?");
			x = user.nextDouble();
			answer = Math.abs(Basic.subtract(answer, x));
			System.out.println(answer);
			while (loop == true) {
				System.out.println("What would you like to subtract?");
				input = user.next();
				if (input.equals("bye")) {
					loop = false;
					System.out.println("Your answer is " + answer);
				} else {
					x = Double.parseDouble(input);
					answer = Basic.subtract(answer, x);
					System.out.println("= " + answer);
				}
			}
		}
		if (command.equals("multiply")) {
			answer = 1;
			while (loop == true) {
				System.out.println("What would you like to multiply?");
				input = user.next();
				if(input.equals("bye")){
					loop = false; 
					System.out.println("You answer is " + answer);
				}
				else{
				x = Double.parseDouble(input);
				answer = Basic.multiply(answer, x);
				System.out.println("= " + answer);
				}
			}
		}
		if (command.equals("divide")) {
			System.out.println("What would you like to divide?");
			answer = user.nextDouble();
			while (loop == true) {
				System.out.println("What would you like to divide?");
				input = user.next();
				if(input.equals("bye")){
					loop = false; 
					System.out.println("You answer is " + answer);
				}
				else{
				x = Double.parseDouble(input);
				answer = Basic.divide(answer, x);
				System.out.println(answer);
				}
			}
		}
	}
}
