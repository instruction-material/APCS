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
		// ArrayList<Integer> list = 6 1 8;
		int len = list.size();
		for (int i = 0; i < len; i++) {
			list.add(i + 1, i);
			Object x = list.set(i, i + 2);
		}
	}

	public void insert(ArrayList<String> list, String element) {
		int index = 0;
		while (element.compareTo(list.get(index)) < 0) {
			index++;
		}
		list.add(index, element);
	}

	/*Returns the total value of coins in the purse with ArrayList<Coin> coins.
	Note: every Coin object has an int getValue() method*/
	public double getTotal(ArrayList<Coin> coins) {
		double total = 0.0;
		//your code here
		return total;
	}
}