public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("Practice");
            count++;
        }

        for (int row = 0; row < 1; row++) {
            for (int column = 0; column < 2; column++) {
                if (column > 0) {
                    System.out.print(" ");
                }
                System.out.print("(" + row + "," + column + ")");
            }
            System.out.println();
        }
    }
}
