public class Main {
    public static void main(String[] args) {
        int value = 3;
        for (int step = 0; step < 4; step++) {
            System.out.println("Incorrect call: " + value);
            value++;
        }
        System.out.println("Length 3: " + drawLine(3));
        System.out.println("Length 0: " + drawLine(0));
        System.out.println("Length 21: " + drawLine(21));
    }

    public static String drawLine(int length) {
        if (length < 0 || length > 20) {
            return "Length out of range";
        }
        return render(length);
    }

    private static String render(int remaining) {
        if (remaining == 0) {
            return "Done";
        }
        // TODO: Add a dash and call render with a smaller input.
        return "Drawing unfinished";
    }
}
