package com.company;
import java.util.Scanner;  //brings in Scanner class to be used as an input method

public class Main {

    public static void main(String[] args) {
        int tries = 6;
        boolean gamePlay = true;

        while(tries > 0){
            int ranNum = (int)(Math.random() * 20 + 1); //calculates random number between 1 and 20


                System.out.println("Yo what's up? What's your name?");
                Scanner input = new Scanner(System.in);
                String userName = input.nextLine();

                System.out.println("Well alright " + userName + ", I am thinking of a number between 1 and 20.");
                System.out.print("Do you think you can guess it?");

                String numberGuess = input.nextLine();
                int guess = Integer.parseInt(numberGuess);

                if (guess == ranNum) {
                    System.out.println("Good Job " + userName + "! You guessed correctly!");
                    System.out.println("Care to have another go? (y or n)");
                    String response = input.nextLine();

                    if(response.equals("n")){
                        gamePlay = false;
                    }

                } else if (guess < ranNum) {
                    System.out.println("Dang it!, you guessed too low. Try again");
                    tries--;
                } else if (guess > ranNum) {
                    System.out.println("Whoa! You guessed a tad bit too high. Try again.");
                    tries--;

                }

        }
    }
}
