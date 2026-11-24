public class Fish extends Pet {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String kind() {
        return "fish";
    }

    @Override
    public String food() {
        return "flakes";
    }

    @Override
    public String play() {
        return name() + " swims past a hoop.";
    }
}
