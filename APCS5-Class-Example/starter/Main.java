public class Main {
    public static void main(String[] args) {
        TestClass first = new TestClass("Fern");
        TestClass second = new TestClass("Moss");
        String firstValue = first.printAndReturnConstructorArgument();
        String secondValue = second.printAndReturnConstructorArgument();
        System.out.println("First returned: " + firstValue);
        System.out.println("Second returned: " + secondValue);
    }
}
