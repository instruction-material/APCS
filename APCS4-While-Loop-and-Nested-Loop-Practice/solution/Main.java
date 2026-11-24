public class Main {
    public static void main(String[] args) {
        System.out.println("Halving");
        int value = 129;
        while (value > 0) {
            System.out.println(value);
            value /= 2;
        }

        System.out.println("Before the first 7");
        int[] draws = {3, 1, 7, 9};
        int index = 0;
        while (index < draws.length && draws[index] != 7) {
            System.out.println(draws[index]);
            index++;
        }

        System.out.println("For staircase");
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("While staircase");
        int row = 1;
        while (row <= 10) {
            int column = 1;
            while (column <= row) {
                System.out.print("*");
                column++;
            }
            System.out.println();
            row++;
        }

        System.out.println("For table");
        for (int tableRow = 1; tableRow <= 12; tableRow++) {
            for (int column = 1; column <= 12; column++) {
                if (column > 1) {
                    System.out.print(" ");
                }
                System.out.print(tableRow * column);
            }
            System.out.println();
        }

        System.out.println("While table");
        int tableRow = 1;
        while (tableRow <= 12) {
            int column = 1;
            while (column <= 12) {
                if (column > 1) {
                    System.out.print(" ");
                }
                System.out.print(tableRow * column);
                column++;
            }
            System.out.println();
            tableRow++;
        }
    }
}
