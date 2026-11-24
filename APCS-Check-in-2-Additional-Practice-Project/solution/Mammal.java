public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String classification() {
        return super.classification() + " > Mammalia";
    }
}
