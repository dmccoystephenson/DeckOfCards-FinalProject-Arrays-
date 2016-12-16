
public class Driver {

	public static void main(String[] args) {
		
		DeckOfCards myDeck = new DeckOfCards();
		
		myDeck.shuffleDeck();
		
		for (int i = 0; i < 6; i++) {
			myDeck.dealTopCard();
		}
	
	}

}
