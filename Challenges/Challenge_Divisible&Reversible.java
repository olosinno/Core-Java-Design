import java.util.Scanner;

class CodeChallenges {

    private static void divisible(int parameter) {
        if (parameter % 15 == 0) System.out.println("Your number " + parameter + " is divisible by both 3 and 5!");
        else if (parameter % 3 == 0)  System.out.println("Your number is divisible by 3.");
        else if (parameter % 5 == 0)  System.out.println("Your number is divisible by 5.");
        else System.out.println("Your number isn't divisible by either 3 or 5.");
    }

    private static void reversal(String parameter) {
        String reverse = "";
        for (int i = parameter.length() - 1; i >= 0; i--)
        reverse = reverse + parameter.charAt(i);
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        // setup #1: Write a program to print numbers which are divisible by 3, 5 and 3 and 5.
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Enter a number and I will check which are divisible by 3, 5, or both.  Also enter a String and I will reverse it!  ");
        number = scan.nextInt();
        divisible(number);
        // setup #2: Reverse string without .reverse() method.
        String input;
        System.out.print("E");
        input = scan.nextLine();
        reversal(input);

        scan.close();
    }
}
// compile with javac [ClassName].java --release [java version], run with java [ClassName]
