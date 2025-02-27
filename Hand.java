



import java.util.ArrayList;

//This is the object class for the hand that the dealer and the player will get
public class Hand {
    private final ArrayList<Card> cards;
    private int totalValue;

    //Contructor for the hand class that takes in the cards arraylist
    public Hand() {
        cards  = new ArrayList<>();
        this.totalValue = 0; 
    }
    //Method that inputs a new card into the hand the player or dealer has and also calculates the card's value. 
    public void addCard(Card card) {
        cards.add(card);
        totalValue += card.getValue();
        recalculateTotalValue();
    }

    //Incase the player gets an Ace, we need to recalculate the total value of the hand
    private void recalculateTotalValue() {
        if (totalValue > 21) {
            boolean adjusted = false;
            for (Card card : cards) {
                if (card.getValue() == 11) {
                    totalValue -= 10;
                    adjusted = true;
                    break;
                }
            }
            if( !adjusted) {
                recalculateTotalValue();
            }
        }
    }
    //Calculates the total value of the hand
    public int getTotalValue() {
        return totalValue;
        
    }
    @Override
    public String toString() {
        StringBuilder handString = new StringBuilder();
        for (Card card : cards) {
            handString.append(card.toString()).append(" ");
        }
        return handString.toString().trim();
    }
    

}
