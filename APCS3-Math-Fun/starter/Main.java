import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();
        int signedValue = input.nextInt();
        double raised = Math.pow(base, power);
        System.out.println("Power: " + raised);
        // Add the two roots and the absolute value.
    }
}
