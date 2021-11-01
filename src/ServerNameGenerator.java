

public class ServerNameGenerator {



    public static int randomIndex() {
        int max = 9;
        int min = 0;
        int range = max - min + 1;
        int randomIndex = 0;
        for (int i = 0; i < 9; i++) {
            randomIndex = (int)(Math.random() * range) + min;
        }
        return randomIndex;
    }

    public static void main(String[] args) {

        String[] adjectives = {"industrious", "gray", "kaput", "faint", "male", "festive", "salty", "impossible", "aloof", "ahead"};
        String[] nouns = {"cough", "weather", "guide", "muscle", "lip", "plot", "motion", "invention",
                "wire", "clover"};



        System.out.println("Here is your server name: ");
        System.out.println(adjectives[randomIndex()] + "-" + nouns[randomIndex()]);
    }

}
