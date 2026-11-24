import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();
        int signedValue = input.nextInt();
        double raised = Math.pow(base, power);
        System.out.println("Power: " + raised);
        double squareRoot = Math.sqrt(raised);
        double fourthRoot = Math.sqrt(squareRoot);
        System.out.println("Square root: " + squareRoot);
        System.out.println("Fourth root: " + fourthRoot);
        System.out.println("Absolute value: " + Math.abs(signedValue));
    }
}
