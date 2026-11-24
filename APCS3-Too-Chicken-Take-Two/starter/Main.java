import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean safeLeft = input.nextBoolean();
        boolean safeRight = input.nextBoolean();
        boolean scared = input.nextBoolean();
        boolean hasCompanion = input.nextBoolean();
        System.out.println(decision(safeLeft, safeRight, scared, hasCompanion));
    }

    static String decision(boolean safeLeft, boolean safeRight, boolean scared, boolean hasCompanion) {
        if (!safeLeft) {
            return "Blocked on the left";
        }
        return "Complete the remaining conditions";
    }
}
