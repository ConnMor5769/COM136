import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        // complete this method
        char[] code = {'C', 'O', 'D', 'E'};
        for(int i=0; x>0; i++, x--){    // can update multiple variables with a comma

            if(i == 4){
                i = 0;
            }
            System.out.println("\n" + x + " " + code[i]);
        }
    }

    public static void question1() {
        // COMPLETE THIS METHOD
        int userNumber = Console.getInt("\nPlease enter a positive number: ");
        countdown(userNumber);  // action method so don't need to print it

    }

    // Challenge Question 2    
    public static void question2() {
        // Create an interactive program that calls the methods in the morse class to prove they work
        System.out.println();  // separating line
        String morseCodeTest = Morse.messageToMorse("the quick brown");
        System.out.println(morseCodeTest + "\n\n" + Morse.messageFromMorse(morseCodeTest));
        System.out.println();
        System.out.println(Morse.messageFromMorse("._ / ...."));
        
        String userMessage = Console.getString("\nPlease enter a message: ");
        String morseCode = Morse.messageToMorse(userMessage);
        String decodedMessage = Morse.messageFromMorse(morseCode);
        
        System.out.println("\nOriginal message: " + userMessage);
        System.out.println("Morse code: " + morseCode);
        System.out.println("Decoded message: " + decodedMessage);
        /* decoded message removes capital letters as morse code
           cannot have 2 values, e.g. c and C, so just c. */

    }

    public static void main(String[] args) {

        question1();
        question2();

    }




}