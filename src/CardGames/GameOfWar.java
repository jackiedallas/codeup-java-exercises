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
        int playerOneGamesWon = 0;
        int playerTwoGamesWon = 0;

        while(activeGame) {

            // set players
            Player playerOne = new Player("Player One");
            Player playerTwo = new Player("Player Two");

            // set up both players cards

            playerOne.hand = Arrays.copyOfRange(CARDS, 0, 25);
            playerTwo.hand = Arrays.copyOfRange(CARDS, 26, 51);

            Card playerOneCard = playerOne.hand[randomCard.nextInt(playerOne.hand.length)];
            Card playerTwoCard = playerTwo.hand[randomCard.nextInt(playerTwo.hand.length)];


        }







    }

}
