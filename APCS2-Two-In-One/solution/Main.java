import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        boolean result = (first + second == third)
                || (first + third == second)
                || (second + third == first);
        System.out.println("Two values sum to the third: " + result);
    }
}
