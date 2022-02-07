//package AngelAlfxro;

import java.util.Arrays;
import java.util.Scanner;

// initialized all my arrays and variables
public class Game {
    private int incorrectGuesses = 0;
    private String word;
    private char[] arrayStar;
    private String incG1 = "";


    public Game(String word) {
        this.word = word;
        arrayStar = new char[word.length()];

    }

    public void playGame() { // method to actually play the game once an instance of the object is created
        Scanner userInput = new Scanner(System.in);

        // this will iterate through to the maximum amount of times, reason being is it needs to iterate to the amount of letters possible in a word + 8 times for incorrect guesses
        for (int i = 0; i < word.length() + 8; i++) {
            if (Arrays.equals(arrayStar, word.toCharArray())) {
                System.out.println("congrats you got the word right");
                break;
            }

            System.out.println("enter your letter: ");
            char usersChoice = userInput.next().charAt(0); // scans in the users input as a Char

            if (word.indexOf(usersChoice) != -1) {                         // indexOf returns -1 if the char is not found within the word,
                System.out.println("Congrats you got a right letter ");   // so if its not equal to -1 then we got a letter right and we iterate through a for loop
                for (int j = 0; j < word.length(); j++) {
                    if (usersChoice == word.charAt(j)) {
                        arrayStar[j] = usersChoice;


                    }


                }


                System.out.println(arrayStar);

            } else { // if the users guess is wrong then it adds the wrong choice to a declared string and prints the string
                incorrectGuesses++;
                System.out.println("You made " + incorrectGuesses + " incorrect guesses");
                incG1 += " " + usersChoice;
                System.out.println("Here are your incorrect guesses:  " + incG1);


                if (incorrectGuesses == 8) {
                    System.out.println("Sorry you exceeded your 8 guesses, the word was: " + word);
                    break; // a break statement to break out of the loop if the incorrect guesses get to 8
                }

            }
        }

    }

}



