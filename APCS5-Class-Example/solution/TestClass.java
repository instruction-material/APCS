/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

public class TestClass
{
	
	public String constructorArgument;
	
	public TestClass(String argument) {
		constructorArgument = argument;
	}
	
	public String printAndReturnConstructorArgument() {
		System.out.println(constructorArgument);
		return constructorArgument;
	}
}