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
        Sapien fred = new Sapien("Fred");
        fred.makeSound();
        System.out.println(fred);
        Pygmaeus orangutan = new Pygmaeus("Orangutan");
        System.out.println(orangutan);
    }
}
