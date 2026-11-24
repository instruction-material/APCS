public class LuckGame {
    private int p1Wins;
    private int p2Wins;
    private int ties;

    public void play(Deck one, Deck two) {
        if (one == two || one.size() == 0 || two.size() == 0) {
            return;
        }
        Card cardOne = one.removeRandom();
        Card cardTwo = two.removeRandom();
        if (cardOne == null || cardTwo == null) {
            return;
        }
        if (cardOne.greaterThan(cardTwo)) {
            p1Wins++;
        } else if (cardTwo.greaterThan(cardOne)) {
            p2Wins++;
        } else {
            ties++;
        }
    }

    public int getP1Wins() {
        return p1Wins;
    }

    public int getP2Wins() {
        return p2Wins;
    }

    public int getTies() {
        return ties;
    }

    public String getResults() {
        return "Player one wins: " + p1Wins + "\nPlayer two wins: " + p2Wins + "\nTies: " + ties;
    }
}
