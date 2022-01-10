import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class hangMan {



        public static String getRandomWord() throws Exception {

            File dictionary = new File("src/java/dictionary.txt"); // creates a list of words to utilize in the game.
            Scanner textScanner = new Scanner(dictionary);

            ArrayList<String> wordsArr = new ArrayList<>();
            while(textScanner.hasNextLine()){
                wordsArr.add(textScanner.nextLine());
            }

            String randomWord = wordsArr.get((int)(Math.random() * wordsArr.size()));

            return randomWord;
        }
//        Hangman Drawing below:

    public static void drawHangman(int l) { // Draws out the stick figure as player guesses incorrectly.
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


// Main
    public static void main(String[] args) throws Exception { // possible errors when reading text file
            String randomWord = getRandomWord(); // creates a list of words to utilize in the game.
            Scanner userInput = new Scanner(System.in);

            char[] letterArr = randomWord.toCharArray();
            char[] userAns = new char[letterArr.length];

            for (int i = 0; i < letterArr.length; i++){
                userAns[i] = '?'; //represents answer not found
            }
            boolean fin = false;
            int livesCount = 6;
            while(fin == false){
                System.out.println("*********************");

                String guess = userInput.next();

//                checks validity input
                while(guess.length() != 1 || Character.isDigit(guess.charAt(0))){
                    System.out.println("Error Input - Try Again");
                    guess = userInput.next();
                }
                boolean found = false; //checks if letter is in word.
                for(int i = 0; i < letterArr.length; i++){
                    if(guess.charAt(0) == letterArr[i]){
                        userAns[i] = letterArr[i];
                        found = true;
                    }
                }
                if(!found){
                    livesCount--;
                    System.out.println("incorrect!");
                }
                boolean gameOver = true;
                for(int i = 0; i < userAns.length; i++){
                    if(userAns[i] == '?'){
                        System.out.println(" _");
                        gameOver = false;
                    }
                    else{
                        System.out.println(" " + userAns[i]);
                    }
                }
                System.out.println("\n" + "Lives remaining: " + livesCount);
                drawHangman(livesCount);
                //checks if game is over.
                if(gameOver){
                    System.out.println("Congratulations!");
                    fin = true;
                }

                if(livesCount <= 0){
                    System.out.println("Aww man, You are dead! Try again!");
                }
            }

            System.out.println("Care to have another go? (y or n)");
        String response = userInput.nextLine();
        try {
            switch (response) {
                case "y" -> main(args);//restarts the program

                case "n" -> System.exit(0);//Exits the program.
                default -> throw new Exception();

            }
        }
            catch(Exception e){
                System.out.println("Invalid response.");
                response = userInput.nextLine();
                switch (response) {
                    case "y" -> main(args);//restarts the program

                    case "n" -> System.exit(0);//Exits the program.

                }
            }
        }

    }

