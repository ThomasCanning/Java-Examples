package workingwithfiles;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws IOException {

        File file = new File("test_file.txt");  //Creating a file object
        Scanner scan = new Scanner(file);  //Creating a scanner object passing in file object

        String fileContent = ""; //creating empty string

        while (scan.hasNextLine()) {  //Using a while loop to read all files
            fileContent = fileContent.concat(scan.nextLine() + "\n"); //Adding file content to string

            FileWriter writer = new FileWriter("test_file2.txt.");  //Creating a file writer object
            writer.write(fileContent + "This is line 4");
            writer.close();


        }
    }
}
