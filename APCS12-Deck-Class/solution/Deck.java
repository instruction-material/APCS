/***********************
 *   CODING STANDARD   *
 ***********************/
// Use named constants, descriptive names, and purpose comments before nontrivial scopes

//Wrapper class around the idea of a Deck
//Holds ArrayList of cards

import java.util.ArrayList;


public class Deck
{
	ArrayList<Card> cards;
	
	public Deck(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public int size() {
		return cards.size();
	}
	
	public Card remove(int loc) {
		return cards.remove(loc);
	}
}