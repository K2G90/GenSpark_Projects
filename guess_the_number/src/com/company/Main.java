package com.company;
import java.util.Scanner;  //brings in Scanner class to be used as an input method

public class Main {

    public static void main(String[] args) {
        System.out.println("Yo what's up? What's your name?");
        Scanner inputOne = new Scanner(System.in);
        String userName = inputOne.nextLine();

        System.out.println("Well alright " + userName + ", I am thinking of a number between 1 and 20.");
        System.out.print("Do you think you can guess it?");

        Scanner inputTwo = new Scanner(System.in);
        String numberGuess = inputTwo.nextLine();


        if(Integer.parseInt(numberGuess) == )
    }
}
