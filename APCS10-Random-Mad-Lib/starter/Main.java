import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] adjectives = {"quiet", "bright", "curious"};
        String[] nouns = {"panda", "sloth", "porcupine", "robin"};
        String[] verbs = {"dance", "sing", "waddle", "dream", "whistle"};
        Random random = new Random(410);
        for (int line = 0; line < 5; line++) {
            String adjective = choose(adjectives, random);
            String noun = choose(nouns, random);
            String verb = choose(verbs, random);
            System.out.println("The " + adjective + " " + noun + " began to " + verb + " at midnight.");
        }
    }

    static String choose(String[] words, Random random) {
        // Choose an index for the current bank.
        return words[0];
    }
}
