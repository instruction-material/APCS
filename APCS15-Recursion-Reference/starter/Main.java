public class Main {
    public static void main(String[] args) {
        String[] words = {"red", "fern", ".", "skip"};
        printInReverse(words, 0);
    }

    static void printInReverse(String[] words, int index) {
        if (index == words.length || words[index].equals(".")) {
            return;
        }
        printInReverse(words, index + 1);
        System.out.println(words[index]);
    }
}
