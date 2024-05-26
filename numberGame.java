package CODSOFT;
//The Number Game

import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Random myNumber = new Random();
        int upperLimit = 100;
        int lowerLimit = 0;
        int num = myNumber.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
       // System.out.println(num);        (in case you want to know what random number is thought of)

        System.out.println("Hello User! You have 10 attempts to guess a random number we generated! Good Luck!");
        System.out.println();



        for (int i = 0; i < 10; i++) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Print Your Number:");
            int userNumber = inp.nextInt();

            if (num == userNumber) {
               System.out.println("victory!");
               System.out.println("You got it after"+ " " + (i+1) + " " + "guesses!");
               System.out.println("Your Score is:"+ (i+1));  //Displaying the score
            } else {
                if(userNumber > num+50) {
                    System.out.println("too high, think about a smaller integer!");
                }
                else if(userNumber + 50 < num) {
                    System.out.println("too low, think of a larger integer!");
                }
                else {
                    System.out.println("try again! You are almost there!");
                }
            }
        }



    }
}