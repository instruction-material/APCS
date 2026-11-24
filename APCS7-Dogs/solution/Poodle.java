public class Poodle extends Dog {
    public Poodle(String name) {
        this(name, 20);
    }

    protected Poodle(String name, int size) {
        super(name, "Boof", size);
    }

    @Override
    public String checkIn() {
        return super.checkIn() + " Stays with the group.";
    }
}
