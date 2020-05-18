import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = scan.nextInt();
        scan.close();
        for (int i = (number-1); i > 1; i--) { number = number * i; }
        System.out.println(number);
    }
}
