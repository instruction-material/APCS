public class Pug extends Dog {
    public Pug(String name) {
        super(name, "Snorfle", 10);
    }

    @Override
    public String play() {
        String sound = bark();
        return name() + " plays tug. " + sound + " " + sound + " " + sound;
    }
}
