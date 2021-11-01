import java.util.Scanner;

public class Candy {
    public String name;
    public String size;

    public Candy (String candyName) {
//        this.name = candyName;
//        this.size = "undisclosed";

        this(candyName, "undisclosed");
    }

    public Candy (String candyName, String candySize) {
        this.name = candyName;
        this.size = candySize;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What was the name of your favorite candy? ");
        String userCandyName = scanner.nextLine();

        System.out.print("What was the size of your favorite candy? ");
        String userCandySize = scanner.nextLine();

        Candy userCandy = new Candy(userCandyName, userCandySize);

        System.out.printf("Ahhh, a %s! I see that you got the %s size of it. Sounds Good! :)", userCandyName, userCandySize);
    }
}
