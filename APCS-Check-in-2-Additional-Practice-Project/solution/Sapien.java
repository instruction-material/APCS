/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

public class Sapien extends Homo
{
	public Sapien(String n) {
		super(n, "Sapien");
	}
	
	@Override
	public String makeSound() {
		String ret = "Hello, my name is " + this.name;
		System.out.println(ret);
		return ret;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.speciesType;
	}
}