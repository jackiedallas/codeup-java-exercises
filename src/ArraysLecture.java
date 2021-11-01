import java.util.Arrays;

public class ArraysLecture {



    public static void main(String[] args) {
        double[] prices = new double[4];
        System.out.println("prices.length = " + prices.length);

        final int NUM_OF_SIDES = 6;
        int[] diceSides = new int[NUM_OF_SIDES];
        System.out.println("diceSides.length = " + diceSides.length);

        String[] myBag = {"snickers","reeses", "skittles"};
        System.out.println("myBag.length = " + myBag.length);
//        System.out.println("myBag[0] = " + myBag[0]);

//        for (int i = 0; i < myBag.length; i++) {
//            System.out.println("myBag[i] = " + myBag[i]);
//        }

//        for (String candy : myBag) {
////            System.out.println("myBag[i] = " + candy);
//            System.out.printf("%s is the piece of candy you just pulled out of the bag%n", candy);
//        }

        String[] anotherBag = new String[12];
//        System.out.println("anotherBag[0] = " + anotherBag[0]);
//        System.out.println("anotherBag[5] = " + anotherBag[5]);

        Arrays.fill(anotherBag, "laffy taffys");
//        for (String candy : anotherBag) {
//            System.out.println("candy = " + candy);
//        }

        System.out.println("Arrays.equals(myBag, anotherBag) = " + Arrays.equals(myBag, anotherBag));
        System.out.println("Arrays.equals(anotherBag, anotherBag) = " + Arrays.equals(anotherBag, anotherBag));

        String[] myBagPlusTwo = Arrays.copyOf(myBag, 5);
        System.out.println("myBagPlusTwo.length = " + myBagPlusTwo.length);

        myBagPlusTwo[3] = "payday";
        myBagPlusTwo[4] = "baby ruth";
        Arrays.sort(myBagPlusTwo);
        for (String candy : myBagPlusTwo) {
            System.out.println("candy = " + candy);
        }
        System.out.println(Arrays.toString(myBagPlusTwo));

        int skittlesIndex = Arrays.binarySearch(myBagPlusTwo, "skittles");

        System.out.println("My favorite candy is the purple bag of " + myBagPlusTwo[skittlesIndex]);



        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Arrays.toString(matrix[0]) = " + Arrays.toString(matrix[0]));
        System.out.println("Arrays.toString(matrix[1]) = " + Arrays.toString(matrix[1]));
        System.out.println("Arrays.toString(matrix[2]) = " + Arrays.toString(matrix[2]));

        System.out.println("matrix[0][1] = " + matrix[0][0]);
        System.out.println("matrix[1][0] = " + matrix[1][0]);
        System.out.println("matrix[2][0] = " + matrix[2][0]);

//        for (int[] row : matrix) {
//            System.out.println("+---+---+---+");
//            System.out.print("| ");
//            for (int n : row) {
//                System.out.print(n + " | ");
//            }
//            System.out.println();
//        }
//        System.out.println("+---+---+---+");

//// access the first element in the second row
//        System.out.println(matrix[1][0]); // 4
//// the last element in the first row
//        System.out.println(matrix[0][2]); // 3
//// the first element in the last row
//        System.out.println(matrix[2][0]); // 7


    }


}
