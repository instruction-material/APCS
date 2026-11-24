public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String classification() {
        return "Animalia";
    }

    public String describe() {
        return name + ": " + classification();
    }
}
