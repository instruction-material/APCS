public class Main {
    public static void main(String[] args) {
        System.out.println("Multiples of 3 from 1 through 12: " + countMultiples(1, 12, 3));
        System.out.println("Multiples of 2 from -4 through 4: " + countMultiples(-4, 4, 2));
        System.out.println("Only 5: " + countMultiples(5, 5, 5));
        System.out.println("No matches: " + countMultiples(1, 3, 5));
    }

    public static int countMultiples(int low, int high, int divisor) {
        int count = 0;
        // TODO: Visit each value once and count it if the remainder is zero.
        return count;
    }
}
