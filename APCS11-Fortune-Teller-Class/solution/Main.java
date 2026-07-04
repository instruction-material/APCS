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
		FortuneTeller f = new FortuneTeller();
		System.out.println();
		for (int i = 0; i < 12; i++) {
			System.out.println(f);
		}
	}
}