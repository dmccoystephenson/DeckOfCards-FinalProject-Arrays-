import java.util.*;
public class DeckOfCards extends Card{
	String[] cardName = {"Ace of Spades", "Two of Spades", "Three of Spades", "Four of Spades", "Five of Spades", "Six of Spades", 
						 "Seven of Spades", "Eight of Spades", "Nine of Spades", "Ten of Spades", "Jack of Spades", "Queen of Spades", "King of Spades",
						 "Ace of Hearts", "Two of Hearts", "Three of Hearts", "Four of Hearts", "Five of Hearts", "Six of Hearts", 
						 "Seven of Hearts", "Eight of Hearts", "Nine of Hearts", "Ten of Hearts", "Jack of Hearts", "Queen of Hearts", "King of Hearts", 
						 "Ace of Clubs", "Two of Clubs", "Three of Clubs", "Four of Clubs", "Five of Clubs", "Six of Clubs", 
						 "Seven of Clubs", "Eight of Clubs", "Nine of Clubs", "Ten of Clubs", "Jack of Clubs", "Queen of Clubs", "King of Clubs", 
						 "Ace of Diamonds", "Two of Diamonds", "Three of Diamonds", "Four of Diamonds", "Five of Diamonds", "Six of Diamonds", 
						 "Seven of Diamonds", "Eight of Diamonds", "Nine of Diamonds", "Ten of Diamonds", "Jack of Diamonds", "Queen of Diamonds", "King of Diamonds"};
	
	Random rndm = new Random();
	
	int timesDealt = 0;
	
	public DeckOfCards() {
		
	}
	
	public void shuffleDeck() {		
		String cardHolder;
		
		for (int i = -100; i < rndm.nextInt(200); i++) {
			int x = rndm.nextInt(51);
			int y = rndm.nextInt(51);
			
			cardHolder = cardName[x];
			cardName[x] = cardName[y];
			cardName[y] = cardHolder;
		}
	}
	
	public void dealTopCard() {
		if (timesDealt < 52) {
			System.out.println(cardName[timesDealt]);
			timesDealt++;
		}
		else {
			System.out.println("No more cards to deal!");
		}
	}
}