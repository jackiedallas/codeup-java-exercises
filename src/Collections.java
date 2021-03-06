//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
import java.util.*;

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


        System.out.println("---------------- hash maps lecture below-----------------\n");

        HashMap<String, String> usernames = new HashMap<>();
        // inserting k : v pairs into hashmap
        usernames.put("Jackie", "token");
        usernames.put("Ian", "IansLame");
        usernames.put("Adamina", "minaCold");

        String jackieUserName = usernames.get("Jackie");

        System.out.println("usernames = " + usernames);
        System.out.println("usernames.get(\"Jackie\") = " + jackieUserName);

        // oops we looked for nick as a key, no results found .. we end up with null
        System.out.println("usernames.get(\"nick\") = " + usernames.get("nick"));

        // providing a default might help
        System.out.println("usernames.getOrDefault(\"Nick\", \"No User Found\") = " + usernames.getOrDefault("Nick", "No User Found"));

        // .contains experimentation
        System.out.println("usernames.containsKey(\"Jackie\") = " + usernames.containsKey("Jackie"));
        System.out.println("usernames.containsValue(\"oken\") = " + usernames.containsValue("oken"));
        System.out.println("usernames.containsValue(\"token\") = " + usernames.containsValue("token"));

        System.out.println();

        System.out.println(usernames);

        usernames.putIfAbsent("Jackie", "goatCoder");
        usernames.putIfAbsent("Nick", "reacter");

        System.out.println(usernames);

        System.out.println("usernames.getOrDefault(\"Nick\", \"User not found\") = " + usernames.getOrDefault("Nick", "User not found"));

        usernames.remove("Nick");
        System.out.println(usernames);
        usernames.replace("Jackie", "goatCoder");
        System.out.println(usernames);

        usernames.clear();
        System.out.println(usernames);
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());

    }


}
