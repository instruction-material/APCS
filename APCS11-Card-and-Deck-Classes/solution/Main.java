/**
 * @brief Solve the lesson problem using the provided input and output format
 */
class Main {
    /**
	 * @brief Read input, compute the answer, and write output
	 *
	 * @param args Command-line arguments
	 */
    public static void main(String[] args) {

        Deck p1Deck = new Deck();
        Deck p2Deck = new Deck();

        LuckGame game = new LuckGame();
        for (int i = 0; i < 53; i++) {
            game.play(p1Deck, p2Deck);
        }
        System.out.println(game.getResults());
    }
}
