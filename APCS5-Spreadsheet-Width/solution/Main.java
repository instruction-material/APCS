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

        int width = 5;
        String string = "potato";

        String finalString = "|";
        int length = string.length();

        if (length < width) {
            finalString += string;
            for (int i = length; i < width; i++) {
                finalString += " ";
            }
        } else {
            finalString += string.substring(0, width);
        }

        finalString += "|";
        System.out.println(finalString);
    }
}
