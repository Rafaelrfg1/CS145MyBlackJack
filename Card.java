
//Creating a class object for a card (Which we will manipulate in the deck Class)
public class Card {
    final String suit;
    final String rank;
    final int value;
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    //Method to reveal a certain card
    @Override
    public String toString(){
        return rank + " of " + suit;
    }
}
