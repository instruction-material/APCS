public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String kind() {
        return "dog";
    }

    @Override
    public String food() {
        return "kibble";
    }

    @Override
    public String play() {
        return name() + " plays fetch.";
    }
}
