import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        // complete this method
        char[] code = {'C', 'O', 'D', 'E'};

        for(int i=0; x>0; i++){

            if(i == 4){
                i = 0;
            }
            
            System.out.println("\n" + x + " " + code[i]);
            x--;
        }
        
    }

    public static void question1() {
        // COMPLETE THIS METHOD
        int userNumber = Console.getInt("Please enter a positive number: ");
        countdown(userNumber);  // action method so don't need to print it

    }

    // Challenge Question 2    
    public static void question2() {
        // Create an interactive program that calls the methods in the morse class to prove they work
       // Morse.messageToMorse("the quick brown") and Morse.messageFromMorse("._ / ....") to prove they work


    }


    public static void main(String[] args) {

        question1();
        //question2();

    }




}