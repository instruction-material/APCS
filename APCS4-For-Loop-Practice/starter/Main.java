import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int count = input.nextInt();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] negatives = {-8, -4, -12};

        System.out.println("Repeat the name");
        for (int index = 0; index < count; index++) {
            System.out.println(name);
        }

        System.out.println("Repeat the count");
        // Print count once for every character in name.

        System.out.println("Countdown");
        // Count down from count through zero.

        int product = 1;
        // Multiply product by each value in data.
        System.out.println("Product: " + product);

        System.out.println("Maximum: " + maximum(data));
        System.out.println("Negative maximum: " + maximum(negatives));
    }

    static int maximum(int[] values) {
        // Compare the first value with the rest of the array.
        return values[0];
    }
}
