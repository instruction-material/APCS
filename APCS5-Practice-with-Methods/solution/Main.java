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
        int result = 1;
        for (int factor = 1; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    static int exponent(int base, int power) {
        int result = 1;
        for (int multiplication = 0; multiplication < power; multiplication++) {
            result *= base;
        }
        return result;
    }

    static int numVowels(String word) {
        String vowels = "AEIOUaeiou";
        int count = 0;
        for (int index = 0; index < word.length(); index++) {
            if (vowels.indexOf(word.charAt(index)) >= 0) {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int candidate = 2; candidate <= number / candidate; candidate++) {
            if (number % candidate == 0) {
                return false;
            }
        }
        return true;
    }
}
