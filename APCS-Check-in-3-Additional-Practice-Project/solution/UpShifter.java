/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

class UpShifter extends Shifter
{
	@Override
	public String shift(String word) {
		return shift(word, 1);
	}
}