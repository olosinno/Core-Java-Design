import java.util.Scanner;

public class If_Statement_Test {

    public static void main(String[] args) {
        System.out.print("How fast are you?  Can you run a hundred yard dash?  "); // presents the executable's purpose

        int dashRecord; // creates the input integer.  Use double for decimals!
        String shame;
        Scanner sc = new Scanner(System.in); // creates a new instance of Scanner
        Scanner shameReader = new Scanner(System.in);
        dashRecord = sc.nextInt(); // assigns dashRecord as a Scanner integer
        
        /* This catches the user when attempting to enter whole numbers that aren't feasible or are impossible, such as lower than world records or negative numbers. */
        while (dashRecord < 9) {
            System.out.print("No way, that's impossible!  Be realistic.  ");
            dashRecord = sc.nextInt();
        }

        System.out.print("\nYou ran 300 feet in " + dashRecord + ".0 seconds!  ");
        sc.close(); // closes the scanner, very important

        /* Lines 25-34 are examples of if/then statements, control flow, relational operators, compound statements, if-then statements, nested-if statements, and else-if control. */
        if (dashRecord == 9) System.out.println("You've set a new world record you speedster!  Usain Bolt would be jealous!");
        else if (dashRecord == 10) System.out.println("Wow, you have the same dash runner record as Virginian man Horace H. Lee did in 1877!");
        else if (dashRecord >= 60 && dashRecord < 120) System.out.println("You can do better.");
        else if (dashRecord >= 120) {
            System.out.print("Were you even running?  "); // assigns shameReader as a Scanner string
            shame = shameReader.nextLine();
            if (shame.equalsIgnoreCase("Y") || shame.equalsIgnoreCase("y") || shame.equalsIgnoreCase("Yes") || shame.equalsIgnoreCase("yes")) System.out.println("At least you tried.  Practice!");
            else if (shame.equalsIgnoreCase("N") || shame.equalsIgnoreCase("n") || shame.equalsIgnoreCase("No") || shame.equalsIgnoreCase("no")) System.out.println("Do it again and try harder tubby!");
        }
        else System.out.println("Good job!");

        shameReader.close(); // closes the scanner, very important
    }
}
