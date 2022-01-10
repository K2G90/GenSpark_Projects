import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class hangMan {



        public static String getRandomWord() throws Exception {

            File dictionary = new File("hangman/src/java/java/dictionary.txt"); // creates a list of words to utilize in the game.
            Scanner textScanner = new Scanner(dictionary);

            ArrayList<String> wordsArr = new ArrayList<>();
            while(textScanner.hasNextLine()){
                wordsArr.add(textScanner.nextLine());
            }

            String randomWord = wordsArr.get((int)(Math.random() * wordsArr.size()));

            return randomWord;
        }

        public static void main(String[] args) throws Exception { // possible errors when reading text file
            String randomWord = getRandomWord(); // creates a list of words to utilize in the game.

//        Scanner textScanner = new Scanner(dictionary);
            Scanner userInput = new Scanner(System.in);

            System.out.println(randomWord);
        }

    }

