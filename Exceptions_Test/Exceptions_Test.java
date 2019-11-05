import java.util.InputMismatchException;
import java.util.Scanner;

/* This class will always be thrown bc nothing built into Java will throw custom Exception classes;
To use custom Exception, class Exception must be extended */
class InputException extends Exception {
    /* Serializable class requires a static final serialVersionUID field of type long */
    private static final long serialVersionUID = 1L;
	private int input;
	private String message;
	private static int lower = 1;
	private static int upper = 2;

    /* Establish Getter methods to return private variables */
	public static int getLower() {
		return lower;
    }
	public static int getUpper() {
		return upper;
	}
    public int getInput() {
		return input;
	}
	public String getMessage() {
		return message;
	}
    /* Create constructor to obtain input and message */
	public InputException(int input, String message) {
		this.input = input;
		this.message = message;
	}
}

public class Exceptions_Test {
    public static void main(String[] args) {
        Scanner scan = null; // begins scanner value as null
        int[] arr = new int[4]; // creates array of size 0-3 (4)
		System.out.print("Enter a number: ");
        boolean bool = false; // creates boolean, sets to false

        int number = 0; // Declare outside of try-catch block to allow integer to be read outside of scope

        /* Setup Exception Catcher using try, catch, and finally;
        Create Try block of Exception statement, which will scan in number, then
        detect correctness within established number boundaries before moving to Catch blocks */
        try {
			scan = new Scanner(System.in); // assign scanner value to system input
			number = scan.nextInt(); // assign integer number to next scanned integer
			arr[number] = number; // add number to array's index
			System.out.println("There might've been an exception...");
			/* If statement checks if input number is within acceptable array bounds,
			NOT if number is within array index bounds */
            if (number < InputException.getLower() || number > InputException.getUpper()) {
				throw new InputException(number, "Your input was invalid.");
            }
            bool = true; // If if statement returns false, set boolean to true
        }
		/* Catch block; One try block can have multiple catch blocks;
		Behaves as a switch statement, whereas only one catch is chosen */    
		catch (InputException e) {
			System.out.println("You entered a " + e.getInput() + "\n" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
			if (number < InputException.getLower()) System.out.println("You entered a number that's too small!");
            if (number > InputException.getUpper()) System.out.println("You entered a number that's too big!");
		/* Import usage of built-in exception */
		} catch (InputMismatchException e) {
            // System.out.println("Character other than number was entered.");
            // Can leave catch block (fancy brace enclosure) empty if desired
		/* Throw generic exception last, printing stack trace or else no other Catch blocks will be reached */
		} catch (Exception e) {
			e.printStackTrace();
		/* Finally block - ending action is always taken regardless of whether or not exception is thrown */
		} finally {
			scan.close(); // close Scanner stream
		}
        if (bool) System.out.println("There were no exceptions!~");
    }
}
