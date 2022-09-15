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
                    userScanner.nextLine(); //Reset the scanner
                } catch (Exception e) {
                    System.out.println("NO NUMBERS DETECTED PLEASE TRY AGAIN.");
                    continue;
                }
                try {
                    Thread.sleep(userTime*1000); //Wait for the specified time
                } catch (InterruptedException e) {
                    System.out.println("ERROR STARTING TIMER.");
                }
            } else if (userInput.charAt(0) == '2') {

            } else if (userInput.charAt(0) == '3') {
                System.out.println("Thank you for using this program!");
                exitCode = true;

            } else {
                System.out.println("INPUT NOT VALID, PLEASE TRY AGAIN");
            }

        }

        userScanner.close();
    }
}