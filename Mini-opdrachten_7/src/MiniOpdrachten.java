import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiniOpdrachten {
    static Scanner scanner = new Scanner(System.in);
    static String wordToGuess = "Fiets";
    static String underscores = "";
    static char[] correctLetters = new char[wordToGuess.length()];
    static String correctLettersWrongSpot = "";

    public static void main(String[] args) {
        System.out.println("Guess the word:");

        underscores = "_".repeat(wordToGuess.length());
        System.out.println(underscores);

        //Read user input and execute method
        String input = scanner.nextLine();
        input = input.substring(0, Math.min(input.length(), 5));

        while (!lingo(input)) {
            System.out.println("These letters are in the wrong spot: " + correctLettersWrongSpot);
            System.out.println("Your current guess produced the result: " + new String(correctLetters));
            System.out.println("Please try again");

            input = scanner.nextLine();
            input = input.substring(0, Math.min(input.length(), 5));
        }

        endGame();
    }

    //Execute method and return
    static boolean lingo(String input){
        //Make sure both words are lowercase
        wordToGuess = wordToGuess.toLowerCase();
        input = input.toLowerCase();
        String result = "";
        correctLettersWrongSpot = "";

        //Convert wordToGuess to char arr
        char[] wordToGuessArr = wordToGuess.toCharArray();
        //Covert input to char arr
        char[] inputArr = input.toCharArray();


        int i = 0;
        //Foreach character in the input array check
        for (char character : inputArr) {
            //If the letter in inputArr and wordToGuessArr are at the same spot, add it to correctLetters array
            if(character == wordToGuessArr[i]){
                correctLetters[i] = wordToGuessArr[i];
            }
            //Else add underscore
            else {
                if (wordToGuess.contains("" + character)) {
                    correctLettersWrongSpot += character;
                }
                correctLetters[i] = '_';
            }
            result = new String(correctLetters);
            i++;
        }

        return result.equals(wordToGuess);
    }

    static void endGame(){
        System.out.println("You have guessed the word, it was " + wordToGuess);
    }

}
