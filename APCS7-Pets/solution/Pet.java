public class Pet {
    private final String name;
    private final int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public String kind() {
        return "pet";
    }

    public String food() {
        return "standard food";
    }

    public String play() {
        return name() + " has a play break.";
    }

    public String describe() {
        return name() + " (" + age + ") is a " + kind() + ".";
    }
}
