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
        System.out.println("You have chosen path: " + inPut); //Displays the option user chose.
        try {
            switch (inPut) {

                case "1" -> System.out.println("Hey there!, you want to be my friend and share my treasures?!");
                case "2" -> {
                    System.out.println("You approach the case...");
                    System.out.println("It is dark and spooky...");
                    System.out.println("A large dragon jumps out in front of you! He open his jaws and...");
                    System.out.println("Gobbles you down in one bite!");
                }
                default -> throw new Exception();
            }
        } catch(Exception e) {
                if(inPut.equals("")) System.out.println("Please choose an option!");
                else System.out.println("Please choose Path 1 or 2.");
            }
        }
    }
