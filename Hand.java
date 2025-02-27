



import java.util.ArrayList;


public class Hand {
    private final ArrayList<Card> cards;
    private int totalValue;


    public Hand() {
        cards  = new ArrayList<>();
        this.totalValue = 0; 
    }

    public void addCard(Card card) {
        cards.add(card);
        totalValue += card.getValue();
        //recalculateTotalValue();
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