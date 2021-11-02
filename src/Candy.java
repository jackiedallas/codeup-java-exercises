import java.util.Arrays;
import java.util.Scanner;

public class Candy {
    public String name;
    public String size;
    public String[] descriptors;

    public Candy (String candyName) {
        this(candyName, "undisclosed");
    }

    public Candy (String candyName, String candySize) {
        this.name = candyName;
        this.size = candySize;

    }

    public Candy (String candyName, String candySize, String[] descriptors) {
        this.name = candyName;
        this.size = candySize;
        this.descriptors = descriptors;
    }


    public void candyReport () {
        System.out.printf("Ahh, a %s! I see that you got the %s size of it. Sounds Good! :)", this.name, this.size);
    }

    public void candyDescription () {
        System.out.printf("I have a piece of %s that is %s and could be described as %s.", this.name, this.size, Arrays.toString(this.descriptors));
    }



    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What was the name of your favorite candy? ");
//        String userCandyName = scanner.nextLine();
//
//        System.out.print("What was the size of your favorite candy? ");
//        String userCandySize = scanner.nextLine();
//
//        Candy userCandy = new Candy(userCandyName, userCandySize);
//
//        userCandy.candyReport();
//        System.out.println();
//
//
//        System.out.print("What was the name of your favorite candy? ");
//        String userCandyName2 = scanner.nextLine();
//
//        Candy userCandy2 = new Candy(userCandyName2);
//        userCandy2.candyReport();

        Candy jollyRancherChews = new Candy("Jolly Rancher Chews", "Family Size", new String[] {"wrapped", "chewy", "fruity"});

        System.out.println("Arrays.toString(jollyRancherChews.descriptors) = " + Arrays.toString(jollyRancherChews.descriptors));
//        jollyRancherChews.candyDescription();

        Candy[] myBag = {jollyRancherChews};

        for (Candy singleCandy : myBag) {
            String descriptors = Arrays.toString(singleCandy.descriptors);
            descriptors = descriptors.substring(1, descriptors.length() - 1);
            System.out.println(descriptors);

            System.out.printf("Here's a bag of %s, it is %s, and it's described as %s.", singleCandy.name, singleCandy.size, descriptors);
        }
    }
}
