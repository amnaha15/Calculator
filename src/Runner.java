import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		// Creating necessary variables
		Scanner user = new Scanner(System.in);
		boolean loop = true;
		String command;
		double x, answer;

		System.out.println("Here is how the basic calculator works:");
		System.out.println("Please enter two numbers separated by a mathematical operator");


		while (loop == true) {

			command = user.nextLine();
			
			if(command.contains("/")) {
				
				// test for division character
				String[] arr = command.split("/");
				if(arr.length==2) {
					answer = Basic.divide(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
					System.out.println(answer);
				}

			}

			else if(command.contains("*")) {
				
				// test for multiplication character
				String[] arr = command.split("\\*");
				if(arr.length==2) {
					answer = Basic.multiply(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
					System.out.println(answer);
				}

			}
			
			else if(command.contains("+")) {
				
				// test for addition character
				String[] arr = command.split("\\+");

				System.out.println("monica");

				if(arr.length==2) {
					answer = Basic.add(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
					System.out.println(answer);
				}

			}
			
			else if(command.contains("-")) {
				
				// test for subtraction character
				String[] arr = command.split("-");
				if(arr.length==2) {
					answer = Basic.subtract(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
					System.out.println(answer);
				}

			}
			
			else {
				System.out.println("Exiting Program");
				System.exit(0);
			}

		
		}
		/**
		while (loop == true) {
			command = user.next();

			if (command.equals("=")) {
				System.out.println("Your answer is " + answer);
			}

			x = user.nextDouble();


			if (command.equals("+")) {
				answer = Basic.add(answer, x);
				System.out.println("= " + answer);
			} else if (command.equals("-")) {
				answer = Basic.subtract(answer, x);
				System.out.println("= " + answer);
			} else if (command.equals("*")) {
				answer = Basic.multiply(answer, x);
				System.out.println("= " + answer);
			} else if (command.equals("/")) {
				answer = Basic.divide(answer, x);
				System.out.println("= " + answer);
			} else if (command.equals("^")) {
				answer = Math.pow(answer , x);
				System.out.println("= " + answer);
			}	
		}
		**/

	}
}