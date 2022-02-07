//package AngelAlfxro;

//import AngelAlfxro.Game;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        // Word Bank (list of words we iterate through) & String str " *" for unknown letters

        String[] wordBank = {"hello", "angel", "words", "which", "faith", "jazzy", "great", "happy", "henry", "mikes"};
        ArrayList<String> tempWordBank = new ArrayList<String>(Arrays.asList(wordBank));  // this is the only place i chose to use an arrayList,
        // and that is because the random number function i couldn't find a way to stop it from repeating numbers

        // Scanner function, to begin the game

        int playerChoice = 0;
        Scanner scan = new Scanner(System.in);

        Random r = new Random();

        while (true) { // created a while loop and asked the user if he wanted to keep playing
            if (tempWordBank.size() == 0) {
                System.out.println("Congrats you finished the word bank");
                break;
            }

            try {
                System.out.println("Press 1 to play or any other number to quit");
                playerChoice = scan.nextInt();
            } catch (Exception e) {
                System.out.println("You didn't enter a number, you entered a letter hence this is an error");
            }
            if (playerChoice == 1) {
                int i = r.ints(0, tempWordBank.size()).findFirst().getAsInt();


                String wordChosen = wordBank[i].toLowerCase();   // instantiates Str wordChosen based on the iteration and makes it lowercase (just to be safe)
                System.out.println("The word has been chosen!"); // creates a Str rptdStar and initiates it with the value of " * " repeating till the length of the specific word


                // right here is where we now jump to games.java and play the instance of the game

                Game g = new Game(wordChosen);
                g.playGame();
                tempWordBank.remove(i);
            } else {
                System.out.println("you chose to quit. Goodbye!");
                break;

            }

        }


    }
}


