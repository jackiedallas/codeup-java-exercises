public class Arithmetic {

    // static fields
    // a static property
    public static double pi = 3.14159;

    // static method
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }


    public static void main(String[] args) {
        System.out.println("Arithmetic.pi = " + Arithmetic.pi);

        System.out.println("Arithmetic.add(5, 5) = " + Arithmetic.add(5, 5));
        System.out.println("Arithmetic.subtract(10, 5) = " + Arithmetic.subtract(10, 5));
        System.out.println("Arithmetic.multiply(10, 10) = " + Arithmetic.multiply(10, 10));
        System.out.println("Arithmetic.divide(50, 10) = " + Arithmetic.divide(50, 10));
    }




}
