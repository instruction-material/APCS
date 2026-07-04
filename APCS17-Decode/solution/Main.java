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

		System.out.println("\nMaking two towers");
		Tower one = new Tower(5);
		Tower two = new Tower(5);

		System.out.println("Sending message\n");
		Message m = new Message("We meet at midnight");

		one.transmit(m);
		two.recieve(m);
	}
}