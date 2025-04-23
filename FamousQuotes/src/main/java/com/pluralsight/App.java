package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] quotes = {
                "1- The only thing we have to fear is fear itself.",
                "2- Two roads diverged in a wood, and I, I took the one less traveled by, and that has made all the difference.",
                "3- All the world's a stage, And all the men and women merely players.",
                "4- Knowledge is power.",
                "5- To be or not to be, that is the question.",
                "6- If at first you don't succeed, try, try, try again.",
                "7- I have a dream.",
                "8- May the Force be with you.",
                "9- Elementary, my dear Watson.",
                "10- Go ahead, make my day."};

        String choice;

        do {
            System.out.println("Please select a number between 1 and 10: ");
            int index = scanner.nextInt();
            scanner.nextLine();

            try {
                System.out.println("You selected: " + quotes[index - 1]);
            } catch (Exception e) {
                System.out.println("Invalid Selection");
                e.printStackTrace();
            }
            System.out.println("Would you like to select another quote? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();


    }
}

