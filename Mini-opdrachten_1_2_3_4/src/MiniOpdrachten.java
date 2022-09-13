import java.util.Arrays;
import java.util.Random;

public class MiniOpdrachten {
    public static void main(String[] args) {
        System.out.println("test");

        //Mini-assignment 1
        String str1 = "dop";
        String str2 = "erwt";
        String str3 = "en";
        String result;
        // Concateneer str1, str2 en str3 en assign aan result
        result = str1 + str2 + str3;
        // print string result
        System.out.println("Assignment 1 result: "+ result);

        //-----------------------------------------------------------------------

        //Mini-assignment 2
        System.out.println("Assignment 2 result: "+ checkAmountOfCharacters("Regenen", 'e') );

        //-----------------------------------------------------------------------

        //Mini-assignment 3
        int[] array = {1,2,3};
        System.out.println("Assignment 3 result: "+ calculateSumOfArray(array) );

        //-----------------------------------------------------------------------

        //Mini-assignment 4
        int[] generatedArray = generateArrayNumbers(10);
        int [] sortedArray = generatedArray.clone();
        Arrays.sort(sortedArray);

        System.out.println("Assignment 4 the random array: " + Arrays.toString(generatedArray));
        System.out.println("Assignment 4 the sorted random array: " + Arrays.toString(sortedArray));
    }

    //Mini-assignment 2
    static int checkAmountOfCharacters(String str, char chr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        return count;
    }

    //-----------------------------------------------------------------------

    //Mini-assignment 3
    static int calculateSumOfArray(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //-----------------------------------------------------------------------

    //Mini-assignment 4
    static int[] generateArrayNumbers(int amountOfNumbers){
        int[] arr = new int[amountOfNumbers];
        Random random = new Random();

        for(int i = 0; i < amountOfNumbers; i++){
            //Generate random int between 0 to 50
            arr[i] = random.nextInt(50);
        }
        return arr;
    }

}
