import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code = input.nextLine();
        int minutes = input.nextInt();
        input.nextLine();
        String comment = input.nextLine();
        boolean followUp = input.nextBoolean();
        System.out.println("Practice record: " + code);
        System.out.println("Wait in minutes: " + minutes);
        System.out.println("Comment: " + comment);
        System.out.println("Follow-up requested: " + followUp);
    }
}
