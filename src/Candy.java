import java.util.Scanner;

public class Candy {
    public String name;
    public String size;

    public Candy (String candyName) {
        this(candyName, "undisclosed");
    }

    public Candy (String candyName, String candySize) {
        this.name = candyName;
        this.size = candySize;
    }

    public void candyReport () {
        System.out.printf("Ahh, a %s! I see that you got the %s size of it. Sounds Good! :)", this.name, this.size);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What was the name of your favorite candy? ");
        String userCandyName = scanner.nextLine();

        System.out.print("What was the size of your favorite candy? ");
        String userCandySize = scanner.nextLine();

        Candy userCandy = new Candy(userCandyName, userCandySize);

        userCandy.candyReport();
        System.out.println();


        System.out.print("What was the name of your favorite candy? ");
        String userCandyName2 = scanner.nextLine();

        Candy userCandy2 = new Candy(userCandyName2);
       userCandy2.candyReport();
    }
}
