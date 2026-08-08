/**
 * @brief Solve the lesson problem using the provided input and output format
 */
class Main {
    /**
	 * @brief Read input, compute the answer, and write output
	 *
	 * @param args Command-line arguments
	 */
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", "Woof", "Bob", "Brown", 4, 15);
        Poodle poodle = new Poodle("Pepe", "Paul", "White", 2);
        MiniPoodle mini = new MiniPoodle("Margaret", "Mary", "Cream", 10);
        Pug pug = new Pug("Peter", "Yvonne", "Brown", 7);

        System.out.println();
        System.out.println(dog);
        System.out.println(poodle);
        System.out.println(mini);
        System.out.println(pug);

        System.out.println();
        dog.bark();
        poodle.bark();
        mini.bark();
        pug.bark();

        System.out.println();
        pug.lost();
        mini.lost();

        System.out.println();
        pug.walk();
    }
}
