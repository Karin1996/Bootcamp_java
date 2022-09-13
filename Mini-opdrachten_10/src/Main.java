import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> items = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("I am going on a vacation and are taking with me: ");

        String input = scanner.nextLine();

        while (true){
            checkAndAddItem(input);
            input = scanner.nextLine();
        }
    }

    //Check user input, if it is correct add it to the list and ask for input again
    static void checkAndAddItem(String input){
        //get input value and make it lowercase
        input = input.toLowerCase();

        //If there are no items in the list yet, add the first one
        if(items.size() == 0){
            items.add(input);
        }
        else{
            //get first letter of input
            char firstLetterInput = input.charAt(0);
            //get last item of the list
            int lastItemIndex = items.size() - 1;
            String lastItem = items.get(lastItemIndex);
            //get the last letter of the last item of the list
            char lastLetterItem = lastItem.charAt(lastItem.length() - 1);

            if(firstLetterInput == lastLetterItem){
                items.add(input);
            }
            else{
                System.out.println("Please enter a word that starts with the letter: " + lastLetterItem);
            }
        }

        System.out.println("I am going on a vacation and are taking with me: " + String.join(",", items));
    }
}
