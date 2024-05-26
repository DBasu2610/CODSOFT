package CODSOFT;
//The Quiz Problem

import java.util.*;

class Note extends TimerTask {
    public static int i = 0;

    public void run() {
        System.out.println("Your time : " + ++i + "secs");
        if (i == 20) {
            synchronized (Program.record) {
                Program.record.notify();
            }
        }
    }

}

public class Program {
    protected static Program record;

    public static void main(String[] args) throws InterruptedException {
        record = new Program();

        
        Timer timer = new Timer();
        TimerTask task = new Note();
        Date date = new Date();

        timer.scheduleAtFixedRate(task, date, 2000);

        
        synchronized (record) {
            Scanner input = new Scanner(System.in);
            int score = 0;

            System.out.println("PLAY OUR QUIZ!");

            // Question 1
            System.out.println("Question 1: Who is known as the Father of the Computer?");
            System.out.println("a. Charles Babbage");
            System.out.println("b. Albert Einstein");
            System.out.println("c. M.J Flynn");
            String ans1 = input.nextLine().toLowerCase();
            if (ans1.equals("a")) {
                System.out.println("Correct!Well Done");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is Charles Babbage.");
            }

            
            System.out.println("Question 2: Which of the following is required for the styling of a simple Website?");
            System.out.println("a. CSS");
            System.out.println("b. C++");
            System.out.println("c. C");
            String ans2 = input.nextLine().toLowerCase();
            if (ans2.equals("a")) {
                System.out.println("Correct!Well Done");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is CSS.");
            }

            System.out.println("Question 3: Which one among these is an approach to find the shortest path in a graph?");
            System.out.println("a. Kruskal's Algo");
            System.out.println("b. Prim's Algo");
            System.out.println("c. Bellman Ford Algo");
            String ans3 = input.nextLine().toLowerCase();
            if (ans3.equals("c")) {
                System.out.println("Correct!Well Done");
                score++;
            } else {
                System.out.println("Sorry, the correct answer is Bellman Ford Algo.");
            }

           
            System.out.println("Yay you scored: " + score);
            
            record.wait();
            
             timer.cancel();
             System.out.println("Time Over!");

            
        }

    }
}
