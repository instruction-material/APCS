public class Main {
    public static void main(String[] args) {
        String[] words = {"red", "fern", ".", "skip"};
        System.out.println("After the recursive call:");
        printInReverse(words, 0);
        System.out.println("Before the recursive call:");
        printInInputOrder(words, 0);
    }

    static void printInReverse(String[] words, int index) {
        if (index == words.length || words[index].equals(".")) {
            return;
        }
        printInReverse(words, index + 1);
        System.out.println(words[index]);
    }

    static void printInInputOrder(String[] words, int index) {
        if (index == words.length || words[index].equals(".")) {
            return;
        }
        System.out.println(words[index]);
        printInInputOrder(words, index + 1);
    }
}
