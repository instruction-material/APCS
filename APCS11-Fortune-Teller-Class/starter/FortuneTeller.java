import java.util.ArrayList;
import java.util.Random;

public class FortuneTeller {
    private final ArrayList<String> fortunes = new ArrayList<>();
    private final Random random;

    public FortuneTeller() {
        this(new Random());
    }

    public FortuneTeller(Random random) {
        this.random = random;
        fortunes.add("You will discover a new song.");
        fortunes.add("A small project will work.");
        fortunes.add("You will find a favorite book.");
        fortunes.add("You will solve a puzzle.");
        fortunes.add("You will make a new friend.");
    }

    public int remaining() {
        return fortunes.size();
    }

    public String drawFortune() {
        if (fortunes.isEmpty()) {
            return "No fortunes left.";
        }
        // TODO: Choose a valid random index and remove the selected fortune.
        return "Draw unfinished.";
    }
}
