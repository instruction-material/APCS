public class Main {
    public static void main(String[] args) {
        int numerator = 3;
        int denominator = 2;
        int whole = numerator / denominator;
        double before = (double) numerator / denominator;

        System.out.println("Integer division: " + whole);
        System.out.println("Cast before division: " + before);

        // Print a cast after dividing, then cast a negative decimal.
    }
}
