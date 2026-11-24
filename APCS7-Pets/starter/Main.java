public class Main {
    public static void main(String[] args) {
        Pet[] pets = {new Dog("Maple", 4), new Cat("Moss", 2), new Fish("Bubbles", 1)};
        for (Pet pet : pets) {
            System.out.println(pet.describe() + " Food: " + pet.food() + ". " + pet.play());
        }
    }
}
