import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

    public static void main(String[] args) {

        // old way of creating array
//        String[] nameOfVar = {"thing1", "thing2", "thing3"};
//
//        System.out.println(nameOfVar[3]);

        ArrayList<String> students = new ArrayList<>();

        students.add("jackie");
        System.out.println(students);
        students.add("ian");
        students.add("adamina");

        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(24);
        myFavoriteNums.add(23);

        System.out.println("myFavoriteNums = " + myFavoriteNums);

        students.add("kayla");
        System.out.println(students);

        System.out.println("students.get(1) = " + students.get(1));

        myFavoriteNums.add(8);
        myFavoriteNums.add(24);

        System.out.println("myFavoriteNums.contains(24) = " + myFavoriteNums.contains(24));
        System.out.println("myFavoriteNums.contains(45) = " + myFavoriteNums.contains(45));

        System.out.println(myFavoriteNums);
        System.out.println("myFavoriteNums.lastIndexOf(24) = " + myFavoriteNums.lastIndexOf(24));
        System.out.println("myFavoriteNums.isEmpty() = " + myFavoriteNums.isEmpty());

        myFavoriteNums.remove((Integer) 24);
        myFavoriteNums.remove(2);
        System.out.println();
        System.out.println(myFavoriteNums);

    }


}
