public class PolymorphismDemo {

    // my application [polymorphism dev] has a method calling the employee.work()

    public static void doWork(Worker w) {
        System.out.println(w.work());
    }

    public static void main(String[] args) {
        Worker one = new Worker();
        Worker two = new Manager();

        doWork(one);
        doWork(two);
    }

}
