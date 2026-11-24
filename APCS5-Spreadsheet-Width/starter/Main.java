public class Main {
    public static void main(String[] args) {
        System.out.println(formatCell("potato", 5));
        System.out.println(formatCell("pea", 5));
        System.out.println(formatCell("apple", 5));
        System.out.println(formatCell("", 3));
        System.out.println(formatCell("pear", 0));
    }

    static String formatCell(String text, int width) {
        // Trim or pad text before adding the bars.
        return "|" + text + "|";
    }
}
