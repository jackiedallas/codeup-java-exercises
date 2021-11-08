import java.util.Locale;

public class ExceptionsLecture {
    public static void main(String[] args) throws Exception {

//        System.out.println("Hello world");
//        try {
//            throw new Exception("Hey, something bad happened.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            System.out.println("Let's see if I can divide by 0");
//            int result = 1 / 0;
//            System.out.println("I did it! math is MINE");
//        } catch (ArithmeticException
//         e) {
//            e.printStackTrace();
//        }

        // deeper example
//        try {
////            throw new Exception("Something went wrong!\nError!\nError!\n");
////            throw new RuntimeException("Runtime exception");
//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase(Locale.ROOT));
//        } catch (NullPointerException e) {
//            System.out.println("Null Pointer Exception fired");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (RuntimeException e) {
//            System.out.println("Runtime Exception fired!");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (Exception e) {
//            System.out.println("Generic exception fired!");
//            e.printStackTrace();
//            e.getMessage();
//        } finally {
//            System.out.println("This code is unbreachable!");
//        }

        // array out of bounds example
        try {
            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("most specific");
            e.printStackTrace();
            e.getMessage();
        } catch (RuntimeException e) {
            System.out.println("Sort of specific");
            e.printStackTrace();
            e.getMessage();
        } catch (Exception e) {
            System.out.println("least specific");
        }



    }
}
