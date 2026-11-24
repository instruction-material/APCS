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
        for (int index = 0; index < name.length(); index++) {
            System.out.println(count);
        }

        System.out.println("Countdown");
        for (int index = count; index >= 0; index--) {
            System.out.println(index);
        }

        int product = 1;
        for (int value : data) {
            product *= value;
        }
        System.out.println("Product: " + product);

        System.out.println("Maximum: " + maximum(data));
        System.out.println("Negative maximum: " + maximum(negatives));
    }

    static int maximum(int[] values) {
        int highest = values[0];
        for (int index = 1; index < values.length; index++) {
            if (values[index] > highest) {
                highest = values[index];
            }
        }
        return highest;
    }
}
