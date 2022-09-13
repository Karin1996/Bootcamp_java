import java.util.Arrays;
import java.util.Scanner;

public class MiniOpdrachten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Geef een woord of zin op:");
        input = scanner.nextLine();
        System.out.println("Je woord was: " + input);

        //Create a character array to sort the string
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        String sorted = String.valueOf(arr);

        System.out.println("Alfabetische volgorde is: " + sorted);
    }
}
