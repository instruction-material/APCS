public class Shifter {
    public String shift(String text) {
        return shift(text, 0);
    }

    protected String shift(String text, int amount) {
        StringBuilder result = new StringBuilder();
        int offset = Math.floorMod(amount, 26);
        for (char letter : text.toCharArray()) {
            if (letter >= 'A' && letter <= 'Z') {
                result.append((char) ('A' + (letter - 'A' + offset) % 26));
            } else if (letter >= 'a' && letter <= 'z') {
                result.append((char) ('a' + (letter - 'a' + offset) % 26));
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }
}
