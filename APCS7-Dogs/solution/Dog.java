import java.util.Locale;

public class Dog {
    private final String name;
    private final String sound;
    private final int size;

    public Dog(String name, String sound, int size) {
        this.name = name;
        this.sound = sound;
        this.size = size;
    }

    public String name() {
        return name;
    }

    public String bark() {
        if (size < 15) {
            return sound.toLowerCase(Locale.ROOT);
        }
        return sound.toUpperCase(Locale.ROOT);
    }

    public String checkIn() {
        return name + " checks in.";
    }

    public String play() {
        return name + " plays. " + bark();
    }
}
