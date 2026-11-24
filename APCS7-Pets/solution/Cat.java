public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String kind() {
        return "cat";
    }

    @Override
    public String food() {
        return "cat food";
    }

    @Override
    public String play() {
        return name() + " chases a toy.";
    }
}
