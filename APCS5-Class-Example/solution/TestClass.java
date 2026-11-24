public class TestClass {
    private final String constructorArgument;

    public TestClass(String argument) {
        constructorArgument = argument;
    }

    public String printAndReturnConstructorArgument() {
        System.out.println("Stored: " + constructorArgument);
        return constructorArgument;
    }
}
