import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args) {
        try {
            run(new RobustScanner());
        } catch (NoSuchElementException endOfInput) {
            System.out.println("End of input.");
        }
    }

    private static void run(RobustScanner scanner) {

        //1. divide two integers
        System.out.println("\nAttempt to divide two integers...");
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        // TODO: Prompt again while the value is out of range.
        if (num2 != 0) {
            System.out.println(num1 / num2);
        }

        //2. print the third letter of a word
        System.out.println("\nAttempt to print the third letter of a word...");
        System.out.print("Enter a word: ");
        String word = scanner.next();
        // TODO: Prompt again while the value is out of range.
        if (word.length() >= 3) {
            System.out.println(word.charAt(2));
        }

        //3. print the given index of 'Juni Learning'
        System.out.println("\nAttempt to print the character at the given "
                           + "index of 'Juni Learning':");
        String message = "Juni Learning";
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        // TODO: Prompt again while the value is out of range.
        if (index >= 0 && index < message.length()) {
            System.out.println(message.charAt(index));
        }

        //4. count from num1 to num2
        System.out.println("\nAttempt to count from num1 to num2:");
        System.out.print("Enter a number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        num2 = scanner.nextInt();
        // TODO: Print both endpoints and every integer between them in order.
        System.out.println(num1);
    }
}
