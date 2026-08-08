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
        boolean smallNum = Math.random();
        System.out.println(smallNum);

        double zeroToTen = Math.random() * 10;
        System.out.println(zeroToTen);

        int zeroToTwenty = (int)(Math.random() * 10);
        System.out.println(zeroToTwenty);

        int fourToNinety = (int)((90 - 5) * Math.random()) + 5;
        System.out.println(fourToNinety);
    }
}
