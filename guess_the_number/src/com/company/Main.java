package com.company;
import java.util.Scanner;  //brings in Scanner class to be used as an input method

public class Main {

    public static void main(String[] args) {
        int tries = 6;
        System.out.println("Yo what's up? What's your name?");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        try {
            if(userName == "") {
                    throw new Exception();
            } else{
                System.out.println("Hello " + userName + ", you ready to play?");

            }

        }
        catch(Exception e){
            System.out.println("Please provide your name.");
            userName = input.nextLine();
            System.out.println("Hello " + userName + ", you ready to play?");
        }

        System.out.println("Well alright " + userName + ", I am thinking of a number between 1 and 20.");
        System.out.print("Do you think you can guess it?");

        while(tries > 0){
            int ranNum = (int)(Math.random() * 20 + 1); //calculates random number between 1 and 20
            String numberGuess = input.nextLine();
            int guess = Integer.parseInt(numberGuess);

            try{
                if (guess == ranNum) {
                    System.out.println("Good Job " + userName + "! You guessed correctly with" + tries + " guesses left!");
                    tries = 0;
                    break;

                } else if (guess < ranNum) {
                    System.out.println("Dang it!, you guessed too low. Try again");
                    tries--;

                } else if (guess > ranNum) {
                    System.out.println("Whoa! You guessed a tad bit too high. Try again.");
                    tries--;
                }


               else if ((guess < 1) || (guess > 20)){
                    System.out.println("You are out of range ! Please choose a number between 1 & 20");
                }
               else{
                   throw new Exception();
                }
            }
            catch(Exception e){
                System.out.println("Please choose a between 1 & 20!");

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
