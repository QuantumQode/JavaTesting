import java.util.Scanner;
import java.util.Random;

public class GuessStarter {

    public static void main(String[] args) {
        
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner userInput = new Scanner(System.in);
        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        
        
        
        while (attempts < 3 && !correctGuess) {
            System.out.print("Type a number: ");
            int userGuess = userInput.nextInt();
            attempts++;

            if (userGuess == number) {
                System.out.println("Congratulations! Your guess is correct!");
                correctGuess = true;
            } else if (userGuess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            // If not correct and attempts remain, prompt again
            if (!correctGuess && attempts < 3) {
                System.out.println("Try again!");
            }
        }

        // If the user didn't guess correctly after 3 attempts
        if (!correctGuess) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + number);
        }

        userInput.close();
        
        
        
    }
}