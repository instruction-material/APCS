public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Animal("Robin"),
            new Mammal("Seal"),
            new Primate("Orangutan")
        };
        for (Animal animal : animals) {
            System.out.println(animal.describe());
        }
    }
}
