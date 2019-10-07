import java.util.Arrays;
import java.util.Scanner;

public class IsPrimeRange {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); // establish user input to scan in
        System.out.print("Choose your array's size: "); // Text requests user input 
        int arrSize = userInput.nextInt(); // Receive array size value, only accepting integers
        int[] findAllPrimes = new int[arrSize]; // Create our array of arraySize length, preferred way
        System.out.print("Choose a starting number: ");
        int startNum = userInput.nextInt(); // Receive starter number for array number range

        userInput.close(); // Close scanner stream

        /* Create array length number range filler loop (use < and not <= to avoid out of bounds error)
        For as many times as user specified, save the number range to iterator index */
        for (int iterator = 0; iterator < findAllPrimes.length; iterator++) {
            findAllPrimes[iterator] = startNum;
            startNum++;
        }

        System.out.println("Your array: " + Arrays.toString(findAllPrimes)); // Display full array

        /* Create for-each loop; primarily used to traverse array and minimizes bugs
        loop must go through array and print all prime numbers */
        for (int index = 0; index < findAllPrimes.length; index++) {
            if (isPrime(findAllPrimes[index])) System.out.print(findAllPrimes[index] + ", "); // If index is truly prime, then print
        }
    }

    /* Function returns boolean after testing it for whether or not it is truly a prime number */
    static boolean isPrime(int number) {
        if (number % 2 == 0) return false;
        // get sum of digits, if sum % 3 == 0, then return false
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
