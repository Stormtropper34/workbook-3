package bedtimestories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner bedtimeStory = new Scanner(System.in);
        System.out.println("Bedtime stories: hansel and gretel, goldilocks, and mary had a little lamb");
        System.out.println("Enter the name of a bed time story you chose!!: ");
        String storyName = bedtimeStory.nextLine();


        try {
            FileInputStream fis = new FileInputStream(storyName);
            Scanner scanner = new Scanner(fis);


            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. " + storyName);
            throw new RuntimeException(e);
        }
        bedtimeStory.close();


    }
}
