public class Main {
    public static void main(String[] args) {
        int numerator = 3;
        int denominator = 2;
        int whole = numerator / denominator;
        double before = (double) numerator / denominator;
        double after = (double) (numerator / denominator);
        double negative = -2.75;
        int narrowed = (int) negative;

        System.out.println("Integer division: " + whole);
        System.out.println("Cast before division: " + before);
        System.out.println("Cast after division: " + after);
        System.out.println("Negative cast: " + narrowed);
    }
}
