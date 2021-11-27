import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilepathLecture {
    public static void main(String[] args) throws IOException {
        // creating files and directories in java

        String directory = "./src/data";
        String filename = "groceryList.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename); // A path combining: the directories path + the desired filename


        System.out.println("dataFile = " + dataFile);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectory(dataDirectory);
//        }
//        if (Files.notExists(dataFile)) {
//            Files.createFile(dataFile);
//        }

        // directory and file creation above

        // writing into text file

        Path groceriesTxtPath = Paths.get(directory, filename); // directroy and file combined into one path
        System.out.println("groceriesTxtPath = " + groceriesTxtPath);
        System.out.println("Files.exists(groceriesTxtPath) = " + Files.exists(groceriesTxtPath));

        System.out.println();

        List<String> groceryList = Arrays.asList("diapers", "dark coffee", "jolly rancher chews"); // used asList to make a list datatype of what we passed into our arrays helper class
        System.out.println("groceryList = " + groceryList); // now we need to write to txt file

        Files.write(groceriesTxtPath, groceryList);

        System.out.println();

        List<String> printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);

        // we can write our own print method now

        for (int i = 0; i < groceryList.size(); i+=1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        Files.write(groceriesTxtPath, Arrays.asList("eggs", "creamer"), StandardOpenOption.APPEND); // adds to list instead of overwrite

        System.out.println();
        groceryList = Files.readAllLines(groceriesTxtPath);

        for (int i = 0; i < groceryList.size(); i+=1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>();

        for(String line : groceryList) {
            if (line.equalsIgnoreCase("diapers")) {
                newList.add("luxury diapers");
                continue;
            }
            newList.add(line);
        }

        System.out.println("newList = " + newList);
    }
}
