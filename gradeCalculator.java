package CODSOFT;
//The Grade Calculator

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        System.out.println("How many subjects do you have?");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] marksArray = new int[n];
        int sum = 0;
        float averagePercentage = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your marks in subject" + " " + (i+1) +":");
            marksArray[i] = inp.nextInt();
            
            sum = sum+marksArray[i];
            averagePercentage = sum/n;
        }
        System.out.println("---------------------------------------");
        //Displaying the score
        System.out.println("Your total marks is:"+ sum);
        System.out.println("Your percentage is: " + " " +averagePercentage + "%");
        Grade(averagePercentage);

        System.out.println();//default chart
        System.out.println("---------------------------------------");
        System.out.println("Default Chart:");
        System.out.println("Grade: O : Outstanding");
        System.out.println("Grade: E : Excellent:");
        System.out.println("Grade: A : Very Good");
        System.out.println("Grade: B+ : Good");
        System.out.println("Grade: B : Satisfactory");
        System.out.println("Grade: C : Very Fair");
        System.out.println("Grade: D : Fair");
        System.out.println("Grade: F : Needs Improvement");
       
    }



    public static void Grade(float percentage) {
        if(percentage<30) {
            System.out.println("Grade: F");
        } else if(30<=percentage && 40>percentage) {
            System.out.println("Grade: D");
        }
        else if(40<=percentage && 50>percentage) {
            System.out.println("Grade: C");
        }
        else if(50<=percentage && 60>percentage) {
            System.out.println("Grade: B");
        }
        else if(60<=percentage && 70>percentage) {
            System.out.println("Grade: B+");
        }
        else if(70<=percentage && 80>percentage) {
            System.out.println("Grade: A");
        }
        else if(80<=percentage && 90>percentage) {
            System.out.println("Grade: E");
        }
        else {
            System.out.println("Grade: O");
        }
    }
    
}
