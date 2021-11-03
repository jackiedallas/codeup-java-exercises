package CardGames;

import java.util.Arrays;
import java.util.Random;

public class GameOfWar {

    private static final Card[] CARDS =  CardsArray.shuffleCards(CardsArray.getAllCards());


    public static void main(String[] args) {

        // set players
        Player jackie = new Player("Jackie");
        Player computer = new Player("Computer");

        // set up both players cards

        jackie.hand = Arrays.copyOfRange(CARDS, 0, 25);
        computer.hand = Arrays.copyOfRange(CARDS, 26, 51);




    }

}
