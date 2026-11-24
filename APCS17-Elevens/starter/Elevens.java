import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Elevens {
    public enum Status {
        PLAYING, WON, STUCK
    }

    private static final int HAND_SIZE = 9;
    private final Deck stock;
    private final ArrayList<Card> hand = new ArrayList<>();

    public Elevens(Deck stock) {
        this.stock = stock;
        refill();
    }

    public List<Card> getHand() {
        return List.copyOf(hand);
    }

    public int getStockSize() {
        return stock.size();
    }

    public boolean isLegal(int... slots) {
        if (slots.length < 2 || slots.length > 3) {
            return false;
        }
        int[] sorted = slots.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] < 0 || sorted[i] >= hand.size()) {
                return false;
            }
            if (i > 0 && sorted[i] == sorted[i - 1]) {
                return false;
            }
        }
        int first = hand.get(sorted[0]).getRank();
        int second = hand.get(sorted[1]).getRank();
        if (sorted.length == 2) {
            return first + second == 11;
        }
        // TODO: Require exactly one jack, one queen and one king.
        return false;
    }

    public boolean play(int... slots) {
        if (!isLegal(slots)) {
            return false;
        }
        int[] sorted = slots.clone();
        Arrays.sort(sorted);
        for (int i = sorted.length - 1; i >= 0; i--) {
            hand.remove(sorted[i]);
        }
        // TODO: Refill the hand after a legal removal.
        return true;
    }

    public Status status() {
        if (hand.isEmpty() && stock.size() == 0) {
            return Status.WON;
        }
        return hasMove() ? Status.PLAYING : Status.STUCK;
    }

    private boolean hasMove() {
        for (int a = 0; a < hand.size(); a++) {
            for (int b = a + 1; b < hand.size(); b++) {
                if (isLegal(a, b)) {
                    return true;
                }
                for (int c = b + 1; c < hand.size(); c++) {
                    if (isLegal(a, b, c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void refill() {
        while (hand.size() < HAND_SIZE && stock.size() > 0) {
            hand.add(stock.draw());
        }
    }
}
