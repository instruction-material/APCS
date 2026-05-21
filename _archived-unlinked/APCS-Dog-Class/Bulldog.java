public class Bulldog extends Dog
{
	private int aggressiveness;
	
	public Bulldog() {
		super();
		aggressiveness = 0;
	}
	
	public Bulldog(String bulldogName) {
		super(bulldogName);
		aggressiveness = 0;
	}
	
	public int getAggressiveness() {
		return aggressiveness;
	}
	
	public void setAggressiveness(int val) {
		aggressiveness = val;
	}
	
	// Method overriding
	public int getAge() {
		return super.getAge() * 7;
	}
}