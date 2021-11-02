import util.Input;

public class Person {


    // create a private name property
    private String name;
    protected int age;

    // public string name for inheritance and polymorphismn
//    public String name;

    // Constructor
//    public Person(){};

    public Person (String personName) {
        this.name = personName;
    }

    public Person(String personName, int age) {
        this.name = personName;
        this.age = age;
    }

    // Methods
    public String getName() {
        return name;
    }

    public void setName(String personName) {
        this.name = personName;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
    // main
    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true because both person 1 and person 2 have the same name "John"
//        System.out.println(person1 == person2); // false because just because they have the same name of "John", however they are still two different people


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // this is true, however, redundant.

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName()); // Didn't expect this to compile, however, it did. and because person1 was reassigned to person2 all changes applied to both person 1 and person 2.


        Input input = new Input();



    }




}
