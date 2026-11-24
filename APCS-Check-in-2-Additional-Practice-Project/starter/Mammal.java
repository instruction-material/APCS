public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String classification() {
        // TODO: Append the mammal label to the inherited classification.
        return super.classification();
    }
}
