public class Message {
    private final String text;

    public Message(String text) {
        this.text = text;
    }

    public Message shift(int distance) {
        int offset = Math.floorMod(distance, 26);
        StringBuilder shifted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                shifted.append(shiftLetter(letter, 'A', offset));
            } else if (letter >= 'a' && letter <= 'z') {
                shifted.append(shiftLetter(letter, 'a', offset));
            } else {
                shifted.append(letter);
            }
        }
        return new Message(shifted.toString());
    }

    private static char shiftLetter(char letter, char base, int offset) {
        // TODO: Convert to a position, shift and wrap, then restore the alphabet base.
        return letter;
    }

    @Override
    public String toString() {
        return text;
    }
}
