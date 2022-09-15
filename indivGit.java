import java.io.IOException;
import java.util.Scanner;

public class indivGit {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        boolean exitCode = false; // Used to determine if the user wants to quit

        while (!exitCode) {
            System.out.println("Please select an option:\n1 - Timer\n2 - Stop Watch\n3 - Exit");
            String userInput = userScanner.nextLine();// Take user input

            if (userInput.charAt(0) == '1') {
                System.out.println("Please enter an amount of time in seconds");
                int userTime;
                try {
                    userTime = userScanner.nextInt();
                    userScanner.nextLine(); // Reset the scanner
                } catch (Exception e) {
                    System.out.println("NO NUMBERS DETECTED PLEASE TRY AGAIN.");
                    continue;
                }
                
                timerFunc(userTime);
            }

            else if (userInput.charAt(0) == '2') {
                long startTime = System.currentTimeMillis(), endTime;
                System.out.println("Please press enter when you want to stop the timer.");
                try {
                    System.in.read();
                    endTime = System.currentTimeMillis();
                } catch (IOException e) {
                    System.out.println("THERE WAS AN ERROR WHILE WAITING FOR/TAKING IN USER INPUT. PLEASE TRY AGAIN.");
                    continue;
                }
                
                System.out.println("Total time: "+(endTime-startTime)/1000+" seconds");
                userScanner.nextLine(); // Reset the scanner
            }

            else if (userInput.charAt(0) == '3') {
                System.out.println("Thank you for using this program!");
                exitCode = true;
                userScanner.close();
            } else {
                System.out.println("INPUT NOT VALID, PLEASE TRY AGAIN");
            }

        }

        
    }

    public static boolean timerFunc (int waitTime){
        try {
            Thread.sleep(waitTime * 1000); // Wait for the specified time
            return true; // If the timer worked return true
        } catch (InterruptedException e) {
            System.out.println("ERROR STARTING TIMER.");
            return false; // If the timer failed return false
        }
    }
}