import java.util.Scanner;

public class indivGit {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        boolean exitCode = false; // Used to determine if the user wants to quit

        while (!exitCode) {
            System.out.println("Please select an option:\n1 - Timer\n2 - Multihello\n3 - Exit");
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
                System.out.println("Please enter the amount of hellos you want");
                int userHellos;
                try {
                    userHellos = userScanner.nextInt();
                    userScanner.nextLine(); // Reset the scanner
                } catch (Exception e) {
                    System.out.println("NO NUMBERS DETECTED PLEASE TRY AGAIN.");
                    continue;
                }
                
                System.out.println(multiHelloFunc(userHellos));
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

    public static String multiHelloFunc (int helloNum){
        String helloString = "";
        for(int i = 0; i<helloNum; i++){
            helloString += "hello";
        }
        return helloString;
    }
}