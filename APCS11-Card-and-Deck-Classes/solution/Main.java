import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deck first = new Deck(new Random(17));
        Deck second = new Deck(new Random(17));
        LuckGame game = new LuckGame();
        System.out.println("Initial deck size: " + first.size());

        for (int round = 0; round < 53; round++) {
            game.play(first, second);
        }
        System.out.println(game.getResults());
        System.out.println("Remaining: " + first.size() + ", " + second.size());
    }
}
