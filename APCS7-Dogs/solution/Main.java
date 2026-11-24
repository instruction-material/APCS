public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
            new Dog("Juniper", "Woof", 15),
            new Poodle("Pepper"),
            new MiniPoodle("Pixel"),
            new Pug("Pip")
        };
        for (Dog dog : dogs) {
            System.out.println(dog.name() + ": " + dog.bark());
            System.out.println(dog.checkIn());
            System.out.println(dog.play());
        }
    }
}
