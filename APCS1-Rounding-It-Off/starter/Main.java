import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        int down = (int) amount;
        System.out.println("Rounded down: " + down);
        // Print the rounded-up value and the nearest 1, 10, and 100.
        System.out.println("Complete the remaining rounding directions.");
    }
}
