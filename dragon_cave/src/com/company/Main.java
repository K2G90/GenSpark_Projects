package com.company;
import java.util.Scanner; //Brings in the Scanner Class
public class Main {

    public static void main(String[] args) {

        Scanner enterCave = new Scanner(System.in); //Creates a Scanner object

        System.out.println("You are in a land full of Dragons.");
        System.out.println("In Front of you, you see two caves. In one cave, ");
        System.out.println("the dragon is friendly and will share his treasure with ");
        System.out.println("you. The other dragon is greedy and hungry and will eat you");
        System.out.println("on sight. Which will you choose? (1 or 2)");

        String inPut = enterCave.nextLine();
        System.out.println("You have chosen path: " + inPut);
    }
}
