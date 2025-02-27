



//The dealer object class
public class Dealer {
    private final Hand hand;

    //contructor
    public Dealer() {
        hand = new Hand();
    }
    //Adds a random card to the hand of the dealer object
    public void addCard(Card card) {
        hand.addCard(card);
    }
    //Gets the value of the dealers hand
    public int getHandValue() {
        return hand.getTotalValue();
    
    }
    //Makes the dealer hit if hand value is below 17
    public boolean shouldHit() {
        return hand.getTotalValue() < 17;
    }
    //if dealer hand is over 21 then the dealer loses(Busts)
    public boolean isBussing() {
        return hand.getTotalValue() > 21;
    }
    //Reveals the hand of the dealer
    public String showHand() {
        return hand.toString();
    }
}
