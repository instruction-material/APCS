public class Main {
    public static void main(String[] args) {
        double forty = 40.0;
        System.out.println("1: " + (forty == 20));
        System.out.println("2: " + (35 <= forty));
        int whole = (int) forty;
        System.out.println("3: " + whole);
        System.out.println("4: " + (whole == forty));

        double decimal = 35.5;
        int narrowed = (int) decimal;
        boolean same = decimal == narrowed;
        System.out.println("5: " + same);
        boolean copied = same;
        System.out.println("6: " + copied);
        System.out.println("7: " + (copied == same));

        int divisor = 0;
        System.out.println("8: " + (divisor != 0 && 40 / divisor > 2));
    }
}
