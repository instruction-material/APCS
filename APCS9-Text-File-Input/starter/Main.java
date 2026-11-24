import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("gates.txt"));
        int count = GateLog.countOpen(input);
        input.close();
        if (count == -1) {
            System.out.println("Invalid observation.");
        } else {
            System.out.println("Open: " + count);
        }
    }
}
