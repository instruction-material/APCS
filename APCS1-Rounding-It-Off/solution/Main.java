import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        int down = (int) amount;
        System.out.println("Rounded down: " + down);
        int up = down;
        if (amount > down) {
            up++;
        }
        System.out.println("Rounded up: " + up);
        System.out.println("Nearest 1: " + (int) (amount + 0.5));
        System.out.println("Nearest 10: " + (int) (amount / 10 + 0.5) * 10);
        System.out.println("Nearest 100: " + (int) (amount / 100 + 0.5) * 100);
    }
}
