import java.util.ArrayList;

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

		//1. create list of random numbers
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			int random = (int) (Math.random() * 100) - 50;
			nums.add(random);
		}
		System.out.println("\n50 Random Numbers: " + nums);

		//2. find the minimum
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num < min) {
				min = num;
			}
		}
		System.out.println("\nMinimum: " + min);

		//3. find the maximum
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("Maximum: " + max);
	}
}