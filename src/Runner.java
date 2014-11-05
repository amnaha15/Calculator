/* 
 * bye is to exit add/subtract/multiply
 * 
 */
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {


		//Creating necessary variables
		Scanner user = new Scanner(System.in);
		boolean loop = true;
		String command;
		double x, answer;
		String strAnswer;
		
		System.out.println("Here is how the basic calculator works:");
		System.out.println("Please enter only integer or double values,");
		System.out.println("You will need to type a number followed enter");
		System.out.println("Then type your operation (+ - / *) followed by enter");
		System.out.println("To finish you will need to type '='");
		System.out.println("Ready? Let's go!");
		
		answer = user.nextDouble();
		
		while(loop == true){
			command = user.next();
			x= user.nextDouble();
				if (command.equals("+")) {
					answer = Basic.add(answer, x);
					System.out.println("= " + answer);
				}
				else if (command.equals("-")) {
					answer = Basic.subtract(answer, x);
					System.out.println("= " + answer);
				}
				else if (command.equals("*")) {
					answer = Basic.multiply(answer, x);
					System.out.println("= " + answer);
				}
				else if (command.equals("/")) {
					answer = Basic.divide(answer, x);
					System.out.println(answer);
				}
				else if (command.equals("=")){
					System.out.println("Your answer is" + strAnswer);
				}
				
				
		}
	}
}

