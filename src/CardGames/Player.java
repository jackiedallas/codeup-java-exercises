package CardGames;

public class Player {

    // fields
    public int gamesWon;
    public String name;
    public Card[] hand;

    // Player constructor
    public Player (String playerName) {
        this.name = playerName;
        this.hand = null;
        this.gamesWon = 0;
    }
}
