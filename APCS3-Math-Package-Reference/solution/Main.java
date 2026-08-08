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
        int absolute = Math.abs(-3);
        System.out.println(absolute);
        double raised = Math.pow(absolute, 2);
        double root = Math.sqrt(raised);
        System.out.println(root);
    }
}
