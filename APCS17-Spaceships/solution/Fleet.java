/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

import java.util.ArrayList;


public class Fleet
{
	public ArrayList<Spaceship> ships;
	
	public Fleet() {
		this.ships = new ArrayList<>();
	}
	
	public Fleet(ArrayList<Spaceship> ships) {
		this.ships = ships;
	}
	
	@Override
	public String toString() {
		return "Fleet: " + this.ships.toString() + "\n";
	}
}