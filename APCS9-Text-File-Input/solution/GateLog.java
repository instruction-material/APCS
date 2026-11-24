import java.util.Scanner;

public class GateLog {
    public static int countOpen(Scanner input) {
        int count = 0;
        while (input.hasNext()) {
            String observation = input.next();
            if (!observation.equals("open") && !observation.equals("closed")) {
                return -1;
            }
            if (observation.equals("open")) {
                count++;
            }
        }
        return count;
    }
}
