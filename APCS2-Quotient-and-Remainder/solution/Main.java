import java.util.Scanner;

/**
 * @brief Solve the lesson problem using the provided input and output format
 */
class Main {
    /**
	 * @brief Read input, compute the answer, and write output
	 *
	 * @param args Command-line arguments
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDivisor: ");
        int divisor = scanner.nextInt();
        System.out.print("Dividend: ");
        int dividend = scanner.nextInt();

        int quotient = divisor / dividend;
        int remainder = divisor - (dividend * quotient);

        System.out.println(divisor + " divided by " + dividend + " equals " +
                           quotient + " with a remainder of " + remainder +
                           ".");
    }
}
