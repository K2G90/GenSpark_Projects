package java;
import java.util.*;
import java.io.File;

public class hangman {

    public static int getRandomNumber() {

        Random mixedNum = new Random();
        return mixedNum.nextInt(3);
    }

    public static String getRandomWord(int mixedNum) {
        List<String> words = Arrays.asList("racing", "mocha", "optimus");
        ArrayList<String> wordsArr = new ArrayList<String>();
        wordsArr.addAll(words);
        try{
            if(mixedNum > 0 && mixedNum < 5) return wordsArr.get(mixedNum);
            else throw new IndexOutOfBoundsException();
        } catch(IndexOutOfBoundsException e){
            return "not an option";
        }
    }
    public static void drawHangman(int l) {
        if(l == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 5) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 4) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 2) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 1) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else{
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
    }

    public static void main(String[] args) throws Exception {
        File dictionary = new File("hangman/src/java/java/dictionary.txt");
        Scanner textScanner = new Scanner(dictionary);

        int randomChoice = getRandomNumber();
        String randomGuess = getRandomWord(randomChoice);



    }

}