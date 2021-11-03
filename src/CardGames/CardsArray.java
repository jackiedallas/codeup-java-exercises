package CardGames;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardsArray {
    public static Card[] getAllCards() {
        return new Card[]{
                new Card("Club", "Ace", 14),
                new Card("Club", 2),
                new Card("Club", 3),
                new Card("Club", 4),
                new Card("Club", 5),
                new Card("Club", 6),
                new Card("Club", 7),
                new Card("Club", 8),
                new Card("Club", 9),
                new Card("Club", 10),
                new Card("Club", "Jack", 11),
                new Card("Club", "Queen", 12),
                new Card("Club", "King", 13),

                new Card("Diamond", "Ace", 14),
                new Card("Diamond", 2),
                new Card("Diamond", 3),
                new Card("Diamond", 4),
                new Card("Diamond", 5),
                new Card("Diamond", 6),
                new Card("Diamond", 7),
                new Card("Diamond", 8),
                new Card("Diamond", 9),
                new Card("Diamond", 10),
                new Card("Diamond", "Jack", 11),
                new Card("Diamond", "Queen", 12),
                new Card("Diamond", "King", 13),

                new Card("Heart", "Ace", 14),
                new Card("Heart", 2),
                new Card("Heart", 3),
                new Card("Heart", 4),
                new Card("Heart", 5),
                new Card("Heart", 6),
                new Card("Heart", 7),
                new Card("Heart", 8),
                new Card("Heart", 9),
                new Card("Heart", 10),
                new Card("Heart", "Jack", 11),
                new Card("Heart", "Queen", 12),
                new Card("Heart", "King", 13),

                new Card("Spade", "Ace", 14),
                new Card("Spade", 2),
                new Card("Spade", 3),
                new Card("Spade", 4),
                new Card("Spade", 5),
                new Card("Spade", 6),
                new Card("Spade", 7),
                new Card("Spade", 8),
                new Card("Spade", 9),
                new Card("Spade", 10),
                new Card("Spade", "Jack", 11),
                new Card("Spade", "Queen", 12),
                new Card("Spade", "King", 13),
        };
    }

    public static Card[] shuffleCards(Card[] cards) {
        Random shuffle = ThreadLocalRandom.current();
        for (int i = cards.length-1; i > 0 ; i--) {
            int index = shuffle.nextInt(i + 1);

            Card card = cards[index];
            cards[index] = cards[i];
            cards[i] = card;
        }
        return cards;
    }
}
