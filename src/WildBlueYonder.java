import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class WildBlueYonder {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    public static int rollDice(int min, int max) {
        int range = max - min + 1;
        int randomNumber = 0;
        for (int i = 0; i < max; i++) {
            randomNumber = (int)(Math.random() * range) + min;
        }
        return randomNumber;
    }

    int playerHP = 100;
    String playerName;
    String playerWeapon;
    int choice;
    int enemyHP;
    int playerAttack;
    int woodenSpoonAttack = 6;
    int swordAttack = 4;
    int helmetHP = 5;
    int shieldHP = 6;
    int jonSnowHP = 120;
    int jonSnowAttack;


    public void gameOver() {
        System.out.println("Thanks for playing the Wild Blue Yonder!");
    }

    public void fightJonSnow() {

        boolean victory;

        playerAttack = rollDice(10,20);
        jonSnowAttack = rollDice(10,20);

        playerHP += shieldHP;
        int playerDamageDealt = playerAttack + woodenSpoonAttack;
        int enemyDamageDealt = jonSnowAttack + swordAttack;
//        System.out.println("jonSnowAttack = " + jonSnowAttack);
//        System.out.println("playerAttack = " + playerAttack);
        System.out.println("Your current health is " + playerHP +
                ".\nJon Snow attacks you with his sword dealing " + enemyDamageDealt + " damage. \n" +
                "You counter Jon Snow's attack dealing " + playerDamageDealt + " damage.");
        playerHP -= enemyDamageDealt;
        jonSnowHP -= playerDamageDealt;

        System.out.println("Your current health is " + playerHP);
        System.out.println("Jon Snow's health is " + jonSnowHP);

        if (jonSnowHP <= 0) {
            System.out.println("You defeated Jon Snow in battle and was crowned King of the North.");
            System.out.println("What do you want do?");
            System.out.println("1. Go east");
            System.out.println("2. Go west");
            System.out.println("3. Settle down in the North and reign as King");


            choice = sc.nextInt();
            if (choice == 1) {
                east();
            } else if (choice == 2) {
                west();
            } else if (choice == 3) {
                System.out.println("Destiny has decided that you are the true King of the North. The northerners rejoice as you start your reign. Game over.");
                gameOver();
            } else if (playerHP <= 0) {
                System.out.println("You've been defeated by Jon Snow in battle. The northerners rejoice as their King defends their Land from your likely reign of terror. Game Over.");
                gameOver();

            }

        }




        if (playerDamageDealt > enemyDamageDealt) {
            System.out.println("Jon Snow: I've underestimated your abilities, please have mercy, I don't want to fight anymore.");
            System.out.println("What do you want to do?");
            System.out.println("1. Fight");
            System.out.println("2. Leave");

            choice = sc.nextInt();
            if (choice == 1) {
                fightJonSnow();
            } else if (choice == 2) {
                crossRoad();
            } else if (jonSnowHP <= 0) {

            }
        } else if (enemyDamageDealt > playerDamageDealt) {
            System.out.println("Jon Snow: Don't you know that I am King of the North? BEND THE KNEE OR DIE!");
            System.out.println("What do you want to do?");
            System.out.println("1. Fight");
            System.out.println("2. Run");
            System.out.println("3. Bend the knee");

            choice = sc.nextInt();
            if (choice == 1) {
                fightJonSnow();
            } else if (choice == 2) {
                System.out.println("Fortunately you were blessed with Usain Bolt speed and ran away, escaping sure death by the Sword of Jon Snow, You're now in the eastern lands of the Wild Blue Yonder.");
                east();
            } else if (choice == 3) {
                System.out.println("You bent the knee to Jon Snow. You've been permanently assigned to defend the Wall. Game Over.");
                gameOver();
            }
        }






    }


    public void playerSetUp() {


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

        fightJonSnow();





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
