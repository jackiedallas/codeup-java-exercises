import java.util.Scanner;

public class WildBlueYonder {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
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

    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    int enemyHP;
    int swordAttack = 4;
    int helmetHP = 5;
    int shieldHP = 6;

    public void playerSetUp() {
        playerHP = 10;
        enemyHP = 20;

        playerWeapon = "wooden spoon";
        System.out.println("Your HP: " + playerHP);
        System.out.println("Your Weapon: " + playerWeapon);

        System.out.print("Please enter your name: ");
        playerName = sc.nextLine();

        System.out.println("Ok, " + playerName + " , let's start the game!");
    }

    public void mainGate() {
        System.out.println("\n------------------------------------------\n");
        System.out.println("You approach the gates to the wild blue yonder.");
        System.out.println("The gatekeeper is standing guard, you must present an ID card to proceed through the gate.");
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println();
        System.out.println("1. Give gatekeeper your ID");
        System.out.println("2. Talk to gatekeeper");
        System.out.println("3. Attack the gatekeeper");
        System.out.println("4. Leave");
        System.out.println("\n---------------------------------------------\n");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Gatekeeper: Thank you, " + playerName + ", you may proceed through the gate.");
            crossRoad();

        } else if (choice == 2) {
            System.out.println("Gatekeeper: I have nothing to say to you, show me your ID card or turn around.");
            mainGate();
        } else if (choice == 3) {
            playerHP--;
            System.out.println("Gatekeeper: FOOL! Did you take me for an easy mark? \n The gatekeeper punched you in the chest an now you're lying on the ground in defeat. (You receive 1 damage)\n");
            System.out.println("Your HP: " + playerHP);
            mainGate();

        }

    }

    public void crossRoad() {
        System.out.println("\n-----------------------------------\n");
        System.out.println("You made it through the gate and now you have to decide which direction you want to travel. If you go south, you will go back through the main gate.\n\n");
        System.out.println("1. Go north");
        System.out.println("2. Go east");
        System.out.println("3. Go south");
        System.out.println("4. Go west");
        System.out.println("\n-----------------------------------\n");

        choice = sc.nextInt();

        if (choice == 1) {
            north();
        } else if (choice == 2) {
            east();
        } else if (choice == 3) {
            mainGate();
        } else if (choice == 4) {
            west();
        } else {
            crossRoad();
        }
    }

    public void north() {
        System.out.println("------------------------------------------");
        System.out.println("You traveled north and are now face to face with Jon Snow. He insists on a sword fight, except you don't have a sword. However, the guard slipped a shield in your backpack to go along with your wooden spoon.");



    }

    public void east() {

    }

    public void west() {

    }





    public static void main(String[] args) {
        WildBlueYonder game;
        game = new WildBlueYonder();
        game.playerSetUp();
        game.mainGate();




    }

}
