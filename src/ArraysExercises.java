import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] Person, Person name) {
       Person[] newPerson = Arrays.copyOf(Person, Person.length + 1);
       newPerson[newPerson.length - 1] = name;
       return newPerson;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));


//        Person[] Person = {"Jackie, Ian, Adamina"};
        Person[] Person = new Person[3];
        Person[0] = new Person("Jackie");
        Person[1] = new Person("Ian");
        Person[2] = new Person("Adamina");
        Person nick = new Person("Nick");

        Person kenneth = new Person("Kenneth");


//        for (Person name : Person) {
//            System.out.println(name);
//        }

        Person = addPerson(Person, nick);
        Person = addPerson(Person, kenneth);
        for (Person name : Person) {
            System.out.println(name.getName());
        }




    }
}
