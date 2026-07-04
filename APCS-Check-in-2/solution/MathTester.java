/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

/* /////////////////
  Classes 1
*/


/// //////////////

//Have the students define a class MathTester

public class MathTester
{  // Question one
	public static int staticNum; // Question four
	public int num; // Question two
	
	public MathTester() { // Question three
		num = 5;
	}
	
	public MathTester(int n) { // Question three
		num = n;
	}
	
	public int add(int n) { // Question five
		return num + n;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int n) {
		num = n;
	}
}
