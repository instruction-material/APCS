import java.util.ArrayList;
import java.util.Random;

class Main {
    public static ArrayList<Card> shuffle(ArrayList<Card> cards, Random random) {
        ArrayList<Card> remaining = new ArrayList<>(cards);
        ArrayList<Card> shuffled = new ArrayList<>();
        while (!remaining.isEmpty()) {
            int index = random.nextInt(remaining.size());
            shuffled.add(remaining.remove(index));
        }
        return shuffled;
    }

    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        for (int rank = 1; rank <= 13; rank++) {
            cards.add(new Card("Hearts", rank));
        }
        ArrayList<Card> shuffled = shuffle(cards, new Random());
        System.out.println("Original: " + cards);
        System.out.println("Shuffled: " + shuffled);
    }
}
