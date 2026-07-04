/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

public class Pygmaeus extends Pongo
{
	public Pygmaeus(String n) {
		super(n, "Pygmaeus");
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.speciesType;
	}
}