package workingwithfiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomWordGeneration {

    private static int random(int listSize){  //Method for generating random number between 0 and list length
        int randomNumber = (int) (Math.random() * (listSize+1));
        return randomNumber;
    }

    public static String generate() throws FileNotFoundException {
        File file = new File("word_library.txt");  //reading file with words in
        Scanner scan = new Scanner(file);
        List<String> words = new ArrayList<String>();

        for(int i = 0; scan.hasNextLine(); i++) {  //For loop to add all words in file to a list
            words.add(i, scan.nextLine());
        }

        String randomWord = words.get(RandomWordGeneration.random(words.size())); //Using random method to get a random word from the list of words

        return randomWord;
    }
}