import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();
        int minutes = input.nextInt();
        // Read the two remaining fields here.
        System.out.println("Practice record: " + code);
        System.out.println("Wait in minutes: " + minutes);
        System.out.println("Complete the comment and follow-up fields.");
    }
}
