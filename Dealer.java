




public class Dealer {
    private final Hand hand;


    public Dealer() {
        hand = new Hand();
    }
    public void addCard(Card card) {
        hand.addCard(card);
    }
    public int getHandValue() {
        return hand.getTotalValue();
    
    }
    public boolean shouldHit() {
        return hand.getTotalValue() < 17;
    }
    public boolean isBussing() {
        return hand.getTotalValue() > 21;
    }
    public String showHand() {
        return hand.toString();
    }
}
