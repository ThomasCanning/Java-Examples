import java.io.FileNotFoundException;

class HangmanTestClass {
    public static void main(String[] args) throws FileNotFoundException {
        String randomWord = workingwithfiles.RandomWordGeneration.generate();
        System.out.println(randomWord);
    }
}
