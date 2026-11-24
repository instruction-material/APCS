import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean safeLeft = input.nextBoolean();
        boolean safeRight = input.nextBoolean();
        boolean scared = input.nextBoolean();
        boolean hasCompanion = input.nextBoolean();
        System.out.println(canCross(safeLeft, safeRight, scared, hasCompanion));
    }

    static boolean canCross(boolean safeLeft, boolean safeRight, boolean scared, boolean hasCompanion) {
        boolean clearBothWays = safeLeft && safeRight;
        boolean ready = !scared || hasCompanion;
        return clearBothWays && ready;
    }
}
