/*****************Pseudocode***************
 * import Scanner and Random class
 * create scanner object and assign it to input var.
 * prompt user for number
 * generate random number and assign it to an int variable
 * run a while loop when guessed number is wrong
 *      if number is lower than generated number: say so and accept new input
 *      else: number is higher
 * if input number match random number then print out.
 *
 */





import java.util.Scanner;


public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("I am thinking about a number between 1 and 10...\nCan you guess it?");
        int num = input.nextInt();
        //create Random object and generate random number
        // cast the double random number into an int type
        int randomInt = (int) (Math.random()*10);

        while (num != randomInt){

            if (num < randomInt) {
                System.out.println("It's too low. Guess again.");
                num = input.nextInt();
            }
            else {
                System.out.println("It's too high. Guess again.");
                num = input.nextInt();
            }

        }

        System.out.println("That's right! You are a good guesser.");

    }
}
/********************Test case **********
 * I am thinking about a number between 1 and 10...
 * Can you guess it?
 * 4
 * It's too low. Guess again.
 * 5
 * That's right! You are a good guesser.
 */
