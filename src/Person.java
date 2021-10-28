public class Person {
    // A class: This is the template or blueprint for a 'person'



    // Instance variables
     public String firstName;
     public String lastName;
     public int age;


     // instance method
    public String joinChat() {
        return lastName + " , " + firstName + " has joined the chat!";
    }

    public static void main(String[] args) {
        Person jackie = new Person();
        jackie.firstName = "Jackie";
        jackie.lastName = "Dallas";
        jackie.age = 29;

        System.out.println("Jackie = "  + jackie);
        System.out.println(jackie.firstName + " " + jackie.lastName + " is my name.");
        System.out.printf("%s %s is my name.", jackie.firstName, jackie.lastName);
        System.out.println();
        System.out.println(jackie.joinChat());

    }



}
