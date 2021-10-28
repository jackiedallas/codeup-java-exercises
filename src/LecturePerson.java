public class LecturePerson {
    // A class: This is the template or blueprint for a 'person'



    // Instance variables
     public String firstName;
     public String lastName;
     public int age;


     // instance method
    public String joinChat() {
        return lastName + " , " + firstName + " has joined the chat!";
    }

    // static variable property -- representing world population
    public static long worldPop = 7_900_000_000L;

    public static void main(String[] args) {
        LecturePerson jackie = new LecturePerson();
        jackie.firstName = "Jackie";
        jackie.lastName = "Dallas";
        jackie.age = 29;

        System.out.println("Jackie = "  + jackie);
        System.out.println(jackie.firstName + " " + jackie.lastName + " is my name.");
        System.out.printf("%s %s is my name.", jackie.firstName, jackie.lastName);
        System.out.println();
        System.out.println(jackie.joinChat());

        System.out.println("worldPop = " + worldPop);

        LecturePerson douglas = new LecturePerson();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        // douglas didn't get counted in the worldPop, how would I add him in the count?

        // would I access the variable alone?
        // maybe instead access through the class name and dot notation
        LecturePerson.worldPop += 1;

        System.out.println("worldPop with douglas = " + worldPop);
//        System.out.println("douglas.worldPop = " + douglas.worldPop); // this WILL work, but it is NOT this proper code and NOT best practice!!

        // can we talk to Person.firstName??
//        System.out.println(Person.firstName); // compile time error, no going forward until fixed.

        // Each person has a different name, but the world population is the same for all people.
        // You cannot access an instanced variable in a static context (only individual people have names, not people in general)






    }



}
