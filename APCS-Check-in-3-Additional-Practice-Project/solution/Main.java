import java.util.Scanner;

/**
 * @brief Solve the lesson problem using the provided input and output format
 */
class Main
{
	/**
	 * @brief Read input, compute the answer, and write output
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nPlease enter a word: ");
		String word = scanner.nextLine();

		Shifter up = new UpShifter();
		Shifter down = new DownShifter();

		//UP
		word = up.shift(word);
		System.out.println(word);

		//DOWN
		word = down.shift(word);
		System.out.println(word);
	}
}