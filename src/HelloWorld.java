public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("""
//                Hello, World! I'm going to take over Java.
//                 Starting a new line here, let's see if this works the way I expected it to.\s
//                 It worked the way I expected it to.""");
//        System.out.println(" I'm going to take over Java.");
//        System.out.print("Code inside of curly braces should be indented");
//        System.out.print(" with four spaces.");
//        System.out.print(" Testing Java Syntax. This line of code should be attached to the string on line 8. \n Starting a new line.");
//        System.out.println("\n println tells the code where to stop reading and start a new line.");

        final byte DAYS_IN_MONTH = 30;
        final short DAYS_IN_YEAR = 365;
        byte monthsInYear = DAYS_IN_YEAR / DAYS_IN_MONTH;
        byte daysInWeek = DAYS_IN_MONTH / 4;
        byte weeksInMonth = (byte) (DAYS_IN_MONTH / daysInWeek);
        System.out.print("How many months are in a year? " + monthsInYear + "\n");
        System.out.print("How many days are in a week? " + daysInWeek + "\n");
        System.out.print("How manys weeks are in a month? " + weeksInMonth + "\n");
        System.out.print("--------------------------- \n");

        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 24;
        System.out.print("This is an example of printing an integer: " + myFavoriteNumber + "\n");

        // 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "This is an example of printing a string \n";
        System.out.print(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?
//        String myString = 'J';

        // 4. Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159;

        // 5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        double myNumber;
//        System.out.print(myNumber);

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        myNumber = 3.14;
//        System.out.print(myNumber); // java: incompatible types: possible lossy conversion from double to long

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;


        // 8. Change your code to assign the value 123 to myNumber.
//        myNumber = 123;


        /* Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        * Because 3.14 is decimal and not an integer, and they have to be assigned accordingly. */

        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? By Declaring myNumber as a double.
        myNumber = 3.14;
        System.out.print("Double data type number is: " + myNumber);
    }

}
