import java.util.Scanner;

public class ParentHood {
    Scanner sc = new Scanner(System.in);

    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    int toddlerHP;

    public void playerSetUp() {
        playerHP = 10;
        toddlerHP = 15;

        playerWeapon = "Cake Pop";
        System.out.println("Your HP: " + playerHP);
        System.out.println("Your Weapon: " + playerWeapon);

        System.out.print("Please enter your name: ");
        playerName = sc.nextLine();

        System.out.println("Ok, " + playerName + " , let's start the game!");
    }

    public static void main(String[] args) {
        ParentHood game;
        game = new ParentHood();
        game.playerSetUp();




    }
    public static int rollDice() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int randomNumber = 0;
        for (int i = 0; i < 6; i++) {
            randomNumber = (int)(Math.random() * range) + min;
        }
        return randomNumber;
    }
}
