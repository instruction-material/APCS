public class Tower {
    private final int key;

    public Tower(int key) {
        this.key = Math.floorMod(key, 26);
    }

    public Message transmit(Message message) {
        return message.shift(key);
    }

    public Message receive(Message message) {
        return message.shift(-key);
    }
}
