import java.util.ArrayList;
import java.util.Collections;


public class Deck {

    //Array containing all the cards in the deck
    final ArrayList<Card> deck;

    //All the possible suits, ranks, and values for a card in the deck
    public Deck() {
        // ArrayList<Card> deck; // Removed the local variable declaration
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "Kind", "Ace"};
        int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};


        //Creating a deck of cards (A collection)
        deck = new ArrayList<>();
        for (String suit : suits) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(new Card(suit, ranks[j], value[j]));
            }
        }
        
    }
    //Method to shuffle the deck of cards(Randomize)
    public void shuffle() {
        Collections.shuffle(deck);
    }
    //Method that gets a random card from the deck and uses this to input to either the dealer's or the player's hand
    public Card drawCard() {
        return deck.remove(0);
    }



}
