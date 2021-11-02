public class Employee  extends Person {

    public Employee(String employeeName) {
        super(employeeName);
    }

    @Override
    public void sayHello() {
        System.out.println("Welcome to Dallas Enterprise - how may I help you?");
    }

    public int getAge() {
        return this.age;
    }

    public void doWork() {
        System.out.println("Work Work Work!");
    }

    public static void main(String[] args) {


        Person ian = new Person("Ian");
        ian.sayHello();
        System.out.println("ian.getName() = " + ian.getName());

        System.out.println();

        Employee jackie = new Employee("Jackie");
        jackie.sayHello();
        System.out.println("jackie.getName() = " + jackie.getName());

        System.out.println();

        jackie.doWork();

//        ian.doWork();


    }




}
