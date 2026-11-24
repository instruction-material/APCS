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
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
