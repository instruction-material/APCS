import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend = input.nextInt();
        int divisor = input.nextInt();
        if (divisor == 0) {
            System.out.println("The divisor must be nonzero.");
            return;
        }
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        // Calculate and print the quotient and remainder.
    }
}
