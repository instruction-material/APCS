import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Shifter up = new UpShifter();
        Shifter down = new DownShifter();
        String forward = up.shift(text);
        System.out.println("Up: " + forward);
        System.out.println("Down: " + down.shift(text));
        System.out.println("Round trip: " + down.shift(forward));
    }
}
