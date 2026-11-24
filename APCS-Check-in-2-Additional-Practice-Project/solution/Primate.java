public class Primate extends Mammal {
    public Primate(String name) {
        super(name);
    }

    @Override
    public String classification() {
        return super.classification() + " > Primates";
    }
}
