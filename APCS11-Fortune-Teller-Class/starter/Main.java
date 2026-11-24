import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FortuneTeller teller = new FortuneTeller(new Random(17));
        for (int draw = 0; draw < 6; draw++) {
            System.out.println(teller.drawFortune());
        }
        System.out.println("Remaining: " + teller.remaining());
    }
}
