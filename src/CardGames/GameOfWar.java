package CardGames;

import java.util.Arrays;
import java.util.Random;

public class GameOfWar {

    private static final Card[] CARDS =  CardsArray.shuffleCards(CardsArray.getAllCards());





    public static void main(String[] args) {

        Random randomCard = new Random();
        boolean activeGame = true;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        int playerOneRoundsWon = 0;
        int playerTwoRoundsWon = 0;
        int playerOneGamesWon = 0;
        int playerTwoGamesWon = 0;
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
                roundCounter++;
            } else if (playerOneCard.value > playerTwoCard.value) {
                System.out.printf("Player One Card: %s %s%n", playerOneCard.suit, playerOneCard.value);
                System.out.printf("Player Two Card: %s %s%n", playerTwoCard.suit, playerTwoCard.value);
                System.out.println("Player One wins the round.");
                playerOneScore++;
                roundCounter++;
                playerOneRoundsWon++;
                System.out.printf("Round %s.%n", roundCounter);
            } else {
                System.out.printf("Player One Card: %s %s%n", playerOneCard.suit, playerOneCard.value);
                System.out.printf("Player Two Card: %s %s%n", playerTwoCard.suit, playerTwoCard.value);
                System.out.println("Player Two wins the round.");
                playerTwoScore++;
                roundCounter++;
                playerTwoRoundsWon++;
                System.out.printf("Round %s.%n", roundCounter);
            }
            if (roundCounter == 26) {
                System.out.printf("""
                        Player One Rounds Won: %s
                        Player Two Rounds Won: %s
                        """, playerOneRoundsWon, playerTwoRoundsWon);
                if (playerOneScore > playerTwoScore) {
                    System.out.println("Player One Wins!");
                } else {
                    System.out.println("Player Two Wins!");
                }
                activeGame = false;

            }


        }







    }

}
