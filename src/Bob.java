import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner userQuestion = new Scanner(System.in);


        boolean confirm;
        do {
            System.out.print("Hello, I'm Bob. Would you like to have a conversation? ");
            String userResponse = userQuestion.nextLine();


            if (userResponse.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userResponse.equals("")) {
                System.out.println("Whatever.");
            } else {
                System.out.println("Fine. Be that way!");
            }

            System.out.print("Do you want to keep talking to Bob? (Y/N) ");
            String keepTalking = userQuestion.nextLine();
            confirm = keepTalking.equalsIgnoreCase("y");
        } while(confirm);


    }
}
