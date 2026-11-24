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
        if (safeLeft) {
            if (safeRight) {
                if (!scared) {
                    return "Cross alone";
                } else if (hasCompanion) {
                    return "Cross with a companion";
                } else {
                    return "Wait for a companion";
                }
            } else {
                return "Blocked on the right";
            }
        } else {
            return "Blocked on the left";
        }
    }
}
