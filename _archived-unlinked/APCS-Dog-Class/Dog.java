public class Dog
{
	// Static variables
	private static int totalDogs = 0;
	// Instance variables
	private String name;
	private int age;
	private double weight;
	private boolean isAlive;
	
	// Default constructor
	public Dog() {
		name = "";
		age = 0;
		weight = 0;
		isAlive = true;
		totalDogs++;
	}
	
	// Overloaded constructor
	public Dog(String theName) {
		name = theName;
		age = 0;
		weight = 0;
		isAlive = true;
		totalDogs++;
	}
	
	public static int getTotalDogs() {
		return totalDogs;
	}
	
	public static void setAgeToTen(Dog d) {
		d.setAge(10);
	}
	
	// Accessor or getter methods
	public int getAge() {
		return age;
	}
	
	// Mutator or setter method
	public void setAge(int theAge) {
		age = theAge;
	}
	
	// toString method
	public String toString() {
		return "This dog is named " + name + ".";
	}
}