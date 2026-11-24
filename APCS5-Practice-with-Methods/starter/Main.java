public class Main {
    public static void main(String[] args) {
        System.out.println("Sum 1, 2: " + sum(1, 2));
        System.out.println("Factorial 5: " + factorial(5));
        System.out.println("Factorial 0: " + factorial(0));
        System.out.println("Exponent 2, 3: " + exponent(2, 3));
        System.out.println("Exponent -3, 0: " + exponent(-3, 0));
        System.out.println("Vowels apple: " + numVowels("apple"));
        System.out.println("Vowels IDEA: " + numVowels("IDEA"));
        System.out.println("Prime 23: " + isPrime(23));
        System.out.println("Prime 1: " + isPrime(1));
        System.out.println("Prime 2: " + isPrime(2));
        System.out.println("Prime 49: " + isPrime(49));
    }

    static int sum(int first, int second) {
        return first + second;
    }

    static int factorial(int number) {
        // Multiply the integers from 1 through number.
        return 1;
    }

    static int exponent(int base, int power) {
        // Multiply by base power times.
        return 1;
    }

    static int numVowels(String word) {
        // Count each A, E, I, O, or U, regardless of case.
        return 0;
    }

    static boolean isPrime(int number) {
        // Reject numbers below 2 and look for a divisor.
        return false;
    }
}
