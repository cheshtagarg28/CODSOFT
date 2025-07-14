import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = r.nextInt(100) + 1; // Random number between 1 and 100
            int attemptsLeft = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess it!");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number.");
                    guessedCorrectly = true;
                    score += 10; // Add 10 points for a correct guess
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("You ran out of attempts. The number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = input.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("\nGame over. Your total score: " + score);
        input.close();
    }
}
