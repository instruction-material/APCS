public class Main {
    public static void main(String[] args) {
        System.out.println("Length of 'hello world': " + length("hello world"));
        // After implementing a method, print its results for the cases in README.md.
    }

    public static int length(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        return 1 + length(text.substring(1));
    }

    public static int factorial(int n) {
        throw new UnsupportedOperationException("Implement factorial first.");
    }

    public static int exponent(int base, int power) {
        throw new UnsupportedOperationException("Implement exponent first.");
    }

    public static int fibonacci(int n) {
        throw new UnsupportedOperationException("Implement fibonacci first.");
    }

    public static int lucas(int n) {
        throw new UnsupportedOperationException("Implement lucas first.");
    }

    public static void cascadeForward(String word) {
        throw new UnsupportedOperationException("Implement cascadeForward first.");
    }

    public static void cascadeBackward(String word) {
        throw new UnsupportedOperationException("Implement cascadeBackward first.");
    }

    public static int log(int base, int result) {
        throw new UnsupportedOperationException("Implement log first.");
    }

    public static int gcd(int a, int b) {
        throw new UnsupportedOperationException("Implement gcd first.");
    }
}
