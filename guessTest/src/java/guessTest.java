package java;

import java.util.Scanner;  //brings in Scanner class to be used as an input method


class Helper {

    public static String Guess(int guess, int ranDumb) {
        String result;
        if (guess < 1 || guess > 20) result = "outOfRange";
        else if (guess > ranDumb) result = "hi";
        else if (guess < ranDumb) result = "low";
        else result = "correct";
        return result;
    }

    public static int randomNumber(){
        return (int)(Math.random() * 20 + 1);
    }
}
public class guessTest {

    public static void main(String[] args) {
        int tries = 6;
        int randy = Helper.randomNumber();

        System.out.println("Yo what's up? What's your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        try {
            if(userName.equals("")) throw new Exception();
            else System.out.println("Hello " + userName + ", you ready to play?");
        }
        catch(Exception e){
            System.out.println("Please provide your name.");
            userName = input.nextLine();
            System.out.println("Hello " + userName + ", you ready to play?");
        }

        System.out.println("Well alright " + userName + ", I am thinking of a number between 1 and 20.");
        System.out.print("Do you think you can guess it?");

        while(tries > 0){

            String numberGuess = input.nextLine();
            try {
                try {
                    if (numberGuess.equals("")) throw new Exception();
                } catch (Exception e) {
                    System.out.println("You entered a blank guess");
                    continue; //continues the iteration of the loop.
                }
                int guess = Integer.parseInt(numberGuess);

                switch(Helper.Guess(guess, randy)) {
                    case "correct":
                        System.out.printf("Good Job  %s !\n You guessed correctly with %s guesses left!%n%n", userName, tries);
                        tries = 0;
                        break;

                    case "hi":
                        tries--;
                        System.out.println("Whoa! You guessed a tad bit too high. Try again.");
                        break;

                    case "low":
                        tries--;
                        System.out.println("Dang it!, you guessed too low. Try again");
                        break;

                    case "outOfRange":
                        System.out.println("Sorry that was an invalid guess.");
                }
            }
            catch(Exception e){
                System.out.println("Sorry that was an invalid guess.");
            }

        }
        System.out.println("Care to have another go? (y or n)");
        String response = input.nextLine();
        try {
            switch (response) {
                case "y" -> main(args);//restarts the program

                case "n" -> System.exit(0);//Exits the program.
                default -> throw new Exception();

            }
        }
        catch(Exception e){
            System.out.println("Invalid response.");
            response = input.nextLine();
            switch (response) {
                case "y" -> main(args);//restarts the program

                case "n" -> System.exit(0);//Exits the program.

            }
        }
    }
}
