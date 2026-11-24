import java.util.Scanner;

public class RobustScanner {
    private final Scanner scanner = new Scanner(System.in);

    public String next() {
        return scanner.next();
    }

    public int nextInt() {
        while (scanner.hasNext() && !scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Enter an integer: ");
        }
        return scanner.nextInt();
    }

    public double nextDouble() {
        while (scanner.hasNext() && !scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Enter a number: ");
        }
        return scanner.nextDouble();
    }
}
