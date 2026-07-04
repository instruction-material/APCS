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
		drawLine(5);
		// drawLineBad(5);
	}

	public static void drawLineBad(int n) {
		System.out.print("-");
		drawLine(n - 1);
	}

	public static void drawLine(int n) {
		if (n == 0) {
			System.out.println("That's all folks!");
		} else {
			System.out.print("-");
			drawLine(n - 1);
		}
	}
}