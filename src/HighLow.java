import java.lang.Math;
import java.util.Scanner;
// Game Development 101
//
//Welcome to the world of game development!
//
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//The specs for the game are:
//
//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
//
//Use the random method of the java.lang.Math class to generate a random number.
//Bonus
//
//Keep track of how many guesses a user makes.
//Set an upper limit on the number of guesses.

public class HighLow {
    public static void main(String[] args) {
      guessingGame();
    }
    public static void guessingGame() {
        boolean confirm;

        do {
            int totalGuesses = 0;
            boolean gameWon = false;
            System.out.print("Welcome to the Guessing Game. I've chosen an integer between 1 and 100. You have 5 chances to choose the right number. Take a guess: ");
            totalGuesses++;
            Scanner sc = new Scanner(System.in);
            int numberToGuess = randomNumber();
            while (!gameWon) {
                int userGuess = sc.nextInt();


                if (userGuess > numberToGuess) {
                    totalGuesses++;
                    System.out.print("Too high, guess again.. ");
                } else if(totalGuesses == 5) {
                    gameWon = true;
                    System.out.println("That was your 5th chance, better luck next time.");
                }
                else if (userGuess < numberToGuess) {
                    totalGuesses++;
                    System.out.print("Too low, guess again.. ");
                } else {
                    System.out.println("Good guess, " + numberToGuess + " is precisely the number I chose!");
                    System.out.println("It took you " + totalGuesses + " tries to win the game.");
                    gameWon = true;
                }

            }

            sc.nextLine();
            System.out.print("Do you want to play again? [Y/N] ");
            String playAgain = sc.nextLine();
            confirm = playAgain.equalsIgnoreCase("y");
        } while(confirm);
        System.out.println("Thanks for playing!");
    }

    public static int randomNumber() {
            int max = 100;
            int min = 1;
            int range = max - min + 1;
            int randomNumber = 0;
            for (int i = 0; i < 100; i++) {
                randomNumber = (int)(Math.random() * range) + min;
            }
            return randomNumber;
        }
}

