package CardGames;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameOfWar {

    private static final Card[] CARDS =  CardsArray.shuffleCards(CardsArray.getAllCards());

    public static void playGame() {
        Random randomCard = new Random();
        boolean activeGame = true;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        int playerOneRoundsWon = 0;
        int playerTwoRoundsWon = 0;
        int roundCounter = 0;

        while(activeGame) {

            // set players
            Player playerOne = new Player("Player One");
            Player playerTwo = new Player("Player Two");

            // set up both players cards

            playerOne.hand = Arrays.copyOfRange(CARDS, 0, 25);
            playerTwo.hand = Arrays.copyOfRange(CARDS, 26, 51);

            Card playerOneCard = playerOne.hand[randomCard.nextInt(playerOne.hand.length)];
            Card playerTwoCard = playerTwo.hand[randomCard.nextInt(playerTwo.hand.length)];

            if (playerOneCard.value == playerTwoCard.value) {
                System.out.printf("Player One Card: %s %s%n", playerOneCard.suit, playerOneCard.value);
                System.out.printf("Player Two Card: %s %s%n", playerTwoCard.suit, playerTwoCard.value);
                System.out.println("It's a tie. No points scored.");
                System.out.println("------------------------------");
                roundCounter++;
            } else if (playerOneCard.value > playerTwoCard.value) {
                System.out.printf("Player One Card: %s %s%n", playerOneCard.suit, playerOneCard.value);
                System.out.printf("Player Two Card: %s %s%n", playerTwoCard.suit, playerTwoCard.value);
                System.out.println("Player One wins the round.");
                playerOneScore++;
                roundCounter++;
                playerOneRoundsWon++;
                System.out.printf("Round %s.%n", roundCounter);
                System.out.println("------------------------------");

            } else {
                System.out.printf("Player One Card: %s %s%n", playerOneCard.suit, playerOneCard.value);
                System.out.printf("Player Two Card: %s %s%n", playerTwoCard.suit, playerTwoCard.value);
                System.out.println("Player Two wins the round.");
                playerTwoScore++;
                roundCounter++;
                playerTwoRoundsWon++;
                System.out.printf("Round %s.%n", roundCounter);
                System.out.println("------------------------------");

            }
            if (roundCounter == 26) {
                System.out.printf("""
                        Player One Rounds Won: %s
                        Player Two Rounds Won: %s
                        """, playerOneRoundsWon, playerTwoRoundsWon);
                System.out.println("------------------------------");

                if (playerOneScore > playerTwoScore) {
                    System.out.println("Player One Wins!");
                } else {
                    System.out.println("Player Two Wins!");
                }
                activeGame = false;
    }





            }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Game of War. Two players will battle for 26 rounds. Who ever has the highest value card at the end of each round wins the point for that round. Whoever wins the most rounds, wins the War! Let's Begin.");
        System.out.println();

        boolean playAgain;
        do {
            playGame();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to play again? [Y/N]");
            String userResponse = scanner.nextLine();
            playAgain = userResponse.equalsIgnoreCase("y");
        } while(playAgain);



    }

}
