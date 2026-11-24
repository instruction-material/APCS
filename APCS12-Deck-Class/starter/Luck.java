import java.util.Random;

public class Luck {
    private final Random random;

    public Luck() {
        this(new Random());
    }

    public Luck(Random random) {
        this.random = random;
    }

    public int luckGame(Deck one, Deck two) {
        if (one == two || one.size() == 0 || two.size() == 0) {
            return 0;
        }
        Card first = one.remove(random.nextInt(one.size()));
        Card second = two.remove(random.nextInt(two.size()));
        return first.greaterThan(second);
    }
}
