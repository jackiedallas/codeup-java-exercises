package CardGames;

public class Card {
    public String suit;
    public int value;
    public String faceCard;

    public Card (String cardSuit, int cardValue) {
        this.suit = cardSuit;
        this.value = cardValue;
    }
    public Card(String cardSuit, String faceCard, int cardValue) {
        this.suit = cardSuit;
        this.value = cardValue;
        this.faceCard = faceCard;
    }



}
